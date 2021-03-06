package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ManagerDAO {
	// 싱글톤 디자인
	private static ManagerDAO instance = new ManagerDAO();
	
	private ManagerDAO() {
		
	}
	
	public static ManagerDAO getInstance() {
		return instance;
	}
	
	// 데이터베이스 커넥션풀 연결
	public Connection getConnection() {
		Connection conn = null;
		Context initContext = null;
		Context envContext = null;
		DataSource ds = null;
		
		try {
			initContext = new InitialContext();
			envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/myoracle");
			conn = ds.getConnection();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public int managerCheck(String id, String pw) throws SQLException {
		int result = -1;
		String sql = "select pw from manager where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString("pw") != null && rs.getString("pw").equals(pw)) {
					result = 1;	// 아이디와 비밀번호 모두 일치
				} else {
					result = 0;	// 비밀번호 불일치
				}
			} else {
				result = -1;	// 아이디 존재하지 존재하지 않음
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return result;
	}
}
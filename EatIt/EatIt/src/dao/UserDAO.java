package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.UserVO;

public class UserDAO {
	private static UserDAO instance = new UserDAO();
	
	private UserDAO(){
	}
	
	public static UserDAO getInstance() {
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
	
	public int userLogin(String user_id, String user_password) throws SQLException {
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select user_password from usr where user_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();

			if(rs.next()) { // 계정 존재
				if(rs.getString("user_password") != null && rs.getString("user_password").equals(user_password)) {
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

	public int userJoin(UserVO uVo) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = -1;
		String sql = "insert into usr values (?, ?, ?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, uVo.getUser_id());
			pstmt.setString(2, uVo.getUser_password());
			pstmt.setString(3, uVo.getUser_name());
			pstmt.setString(4, uVo.getUser_phone());
			pstmt.setString(5, uVo.getUser_email());
			
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return result;
	}
	
	// 사용자 아이디로 사용자의 모든 정보 얻기
	public UserVO getUserInfo(String user_id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from usr where user_id=?";
		UserVO uVo = new UserVO();
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				uVo.setUser_id(rs.getString("user_id"));
				uVo.setUser_password(rs.getString("user_password"));
				uVo.setUser_name(rs.getString("user_name"));
				uVo.setUser_phone(rs.getString("user_phone"));
				uVo.setUser_email(rs.getString("user_email"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return uVo;
	}
}

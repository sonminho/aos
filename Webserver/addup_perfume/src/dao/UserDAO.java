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
	
	// �����ͺ��̽� Ŀ�ؼ�Ǯ ����
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
	
	public int userLoginCheck(String user_id, String user_password) throws SQLException {
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select user_password from users where user_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();

			if(rs.next()) { // ���� ����
				if(rs.getString("user_password") != null && rs.getString("user_password").equals(user_password)) {
					result = 1;	// ���̵�� ��й�ȣ ��� ��ġ
				} else {
					result = 0;	// ��й�ȣ ����ġ
				}
			} else {
				result = -1;	// ���̵� �������� �������� ����
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
	
	public int userIdCheck(String user_id) throws SQLException {
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select user_id from users where user_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) result = 1;
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return result;
	}
	
	public int userJoin(UserVO uVo) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = -1;
		String sql = "insert into users values (?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, uVo.getUser_id());
			pstmt.setString(2, uVo.getUser_password());
			pstmt.setString(3, uVo.getUser_name());
			pstmt.setString(4, uVo.getUser_address());
			pstmt.setString(5, uVo.getUser_phone());
			pstmt.setInt(6, uVo.getUser_age());
			pstmt.setString(7, uVo.getUser_sex());
			
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return result;
	}
	
	public UserVO getUserInfo(String user_id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from users where user_id=?";
		UserVO uVo = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				uVo = new UserVO();
				
				uVo.setUser_id(rs.getString("user_id"));
				uVo.setUser_password(rs.getString("user_password"));
				uVo.setUser_name(rs.getString("user_name"));
				uVo.setUser_address(rs.getString("user_address"));
				uVo.setUser_phone(rs.getString("user_phone"));
				uVo.setUser_age(rs.getInt("user_age"));
				uVo.setUser_sex(rs.getString("user_sex"));
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

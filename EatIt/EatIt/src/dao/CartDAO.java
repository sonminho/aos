package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.CartVO;

public class CartDAO {
	private static CartDAO instance = new CartDAO();
	
	private CartDAO() {
		
	}
	
	public static CartDAO getInstance() {
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
		
	public int insertCart(CartVO cVo) throws SQLException{
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into cart values (?, ?, ?, ?, ?)";
		
		try {		
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cVo.getCart_number());
			pstmt.setString(2, cVo.getCart_name());
			pstmt.setString(3, cVo.getCart_type());
			pstmt.setString(4, cVo.getCart_content());
			pstmt.setString(5, cVo.getCart_id());
			
			result = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return result;
	}
	
	// �ش� ������ ���ã�⿡ �̹� �߰� �Ǿ��ִ��� Ȯ��
	public int checkCart(CartVO cVo) throws SQLException {
		int result = -1;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from cart where cart_number=? and cart_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cVo.getCart_number());
			pstmt.setString(2, cVo.getCart_id());
			rs = pstmt.executeQuery();
			
			// �̹� �ش� ������ ���ã�⿡ �߰��Ǿ�����
			if(rs.next()) {
				result = 1;
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
	
	// �ش� ������ ���ã�� ����Ʈ ���
	public ArrayList<CartVO> getCartList(String user_id) throws SQLException {
		ArrayList<CartVO> list = new ArrayList<CartVO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from cart where cart_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CartVO cVo = new CartVO();
				
				cVo.setCart_number(rs.getInt("cart_number"));
				cVo.setCart_name(rs.getString("cart_name"));
				cVo.setCart_type(rs.getString("cart_type"));
				cVo.setCart_content(rs.getString("cart_content"));
				cVo.setCart_id(rs.getString("cart_id"));
				
				list.add(cVo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return list;
	}
	
	public void deleteCartByNumber(String cart_id, String cart_number) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String sql = "delete from cart where cart_id=? and cart_number=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cart_id);
			pstmt.setString(2, cart_number);
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
	}
}

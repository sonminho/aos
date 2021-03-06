package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.OrderVO;
import dto.ProductVO;

public class OrderDAO {
	private static OrderDAO instance = new OrderDAO();
	
	private OrderDAO(){}
	
	public static OrderDAO getInstance() {
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
	
	// 주문 테이블에 주문 레코드 추가
	public int insertOrder(OrderVO oVo) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = -1;
		String sql = "insert into orders values (order_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, oVo.getOrder_name());
			pstmt.setString(2, oVo.getOrder_address());
			pstmt.setString(3, oVo.getOrder_date());
			pstmt.setInt(4, oVo.getOrder_product_number());
			pstmt.setInt(5, oVo.getOrder_price());
			pstmt.setString(6, oVo.getOrder_product_name());
			pstmt.setString(7, oVo.getOrder_id());
			
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return result;
	}
	
	// 모든 주문 리스트 출력
	public ArrayList<OrderVO> getAllOrderList() throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderVO> list =  null;
		String sql  = "select * from orders ORDER BY order_number asc";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			list = new ArrayList<OrderVO>();
			
			while(rs.next()) {
				OrderVO oVo = new OrderVO();
				
				oVo.setOrder_number(rs.getInt("order_number"));
				oVo.setOrder_name(rs.getString("order_name"));
				oVo.setOrder_address(rs.getString("order_address"));
				oVo.setOrder_date(rs.getString("order_date"));
				oVo.setOrder_product_number(rs.getInt("order_product_number"));
				oVo.setOrder_price(rs.getInt("order_price"));
				oVo.setOrder_product_name(rs.getString("order_product_name"));
				oVo.setOrder_id(rs.getString("order_id"));
				
				list.add(oVo);
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
	
	// 해당 사용자의 주문 리스트 출력
	public ArrayList<OrderVO> getUserOrderList(String user_id) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<OrderVO> list = null;
		String sql = "select * from orders where order_id=?";
	
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			list = new ArrayList<OrderVO>();
			
			while(rs.next()) {
				OrderVO oVo = new OrderVO();
				
				oVo.setOrder_number(rs.getInt("order_number"));
				oVo.setOrder_name(rs.getString("order_name"));
				oVo.setOrder_address(rs.getString("order_address"));
				oVo.setOrder_date(rs.getString("order_date"));
				oVo.setOrder_product_number(rs.getInt("order_product_number"));
				oVo.setOrder_price(rs.getInt("order_price"));
				oVo.setOrder_product_name(rs.getString("order_product_name"));
				oVo.setOrder_id(rs.getString("order_id"));
				
				list.add(oVo);
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
	
	public ProductVO getProductByOrderNumber(int order_number) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ProductVO pVo = null;
		
		String sql = "select * from product where product_number = ?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, order_number);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pVo = new ProductVO();
				
				pVo.setProductNumber(rs.getInt("product_number"));
				pVo.setProductName(rs.getString("product_name"));
				pVo.setProductPrice(rs.getInt("product_price"));
				pVo.setProductContent(rs.getString("product_content"));
				pVo.setProductSexCategory(rs.getString("product_sex_category"));
				pVo.setProductLevelCategory(rs.getString("product_level_category"));
				pVo.setProductImage(rs.getString("product_image"));
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return pVo;

	}
}

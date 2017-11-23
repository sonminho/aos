package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.oreilly.servlet.MultipartRequest;

public class ProductDAO {
	private static ProductDAO instance = new ProductDAO();
	
	private ProductDAO() {
		
	}
	
	public static ProductDAO getInstance() {
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
	
	public int registerProduct(MultipartRequest multi) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into product values(product_seq.nextval, ?, ?, ?, ?, ?, ?)";
		int result = -1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			String product_name = multi.getParameter("product_name");
			String product_price = multi.getParameter("product_price");
			String product_content = multi.getParameter("product_content");
			String product_sex_category = multi.getParameter("product_sex_category");
			String product_level_category = multi.getParameter("product_level_category");
			String product_image = multi.getParameter("product_image");
			
			pstmt.setString(1, product_name);
			pstmt.setString(2, product_price);
			pstmt.setString(3, product_content);
			pstmt.setString(4, product_sex_category);
			pstmt.setString(5, product_level_category);
			pstmt.setString(6, product_image);
			
			result = pstmt.executeUpdate();
			
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return result;
	}
}
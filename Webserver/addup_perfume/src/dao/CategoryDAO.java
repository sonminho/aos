package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.CategoryVO;

public class CategoryDAO {
	private static CategoryDAO instance = new CategoryDAO();
	
	private CategoryDAO() {
		
	}
	
	public static CategoryDAO getInstance() {
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
	
	public ArrayList<CategoryVO> getAllSexCategory() throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<CategoryVO> cList = null;
		
		try {
			conn = getConnection();
			String sql = "select distinct categorysex from category";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			cList = new ArrayList<CategoryVO>();
			
			while(rs.next()) {
				String categorySex = rs.getString("categorysex");
				
				CategoryVO cVo = new CategoryVO();
				
				cVo.setCategorySex(categorySex);
				
				cList.add(cVo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally { 
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return cList;
	}
	
	public ArrayList<CategoryVO> getAllLevelCategory() throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<CategoryVO> cList = null;
		
		try {
			conn = getConnection();
			String sql = "select distinct CATEGORYLEVEL from category";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			cList = new ArrayList<CategoryVO>();
			
			while(rs.next()) {
				String categoryLevel = rs.getString("CATEGORYLEVEL");
				
				CategoryVO cVo = new CategoryVO();
				
				cVo.setCategoryLevel(categoryLevel);
				
				cList.add(cVo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally { 
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
		return cList;
	}
}


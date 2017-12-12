package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dto.PlaceVO;

public class PlaceDAO {
	private static PlaceDAO instance = new PlaceDAO();
	
	private PlaceDAO(){	
	}
	
	public static PlaceDAO getInstance() {
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
	
	// �� �̸����� ������ ã��
	public ArrayList<PlaceVO> getLocalProducts(String place_location) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		PlaceVO pVo = null;
		
		// �ش� ���� ���ϴ� ��� ���������� ��ȯ
		String sql = "select * from place where place_location=?";
		
		ArrayList<PlaceVO> list = new ArrayList<PlaceVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, place_location);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pVo = new PlaceVO();
				
				pVo.setPlace_number(rs.getInt("place_number"));
				pVo.setPlace_name(rs.getString("place_name"));
				pVo.setPlace_location(rs.getString("place_location"));
				pVo.setPlace_type(rs.getString("place_type"));
				pVo.setPlace_tema(rs.getString("place_tema"));
				pVo.setPlace_content(rs.getString("place_content"));
				pVo.setPlace_images(rs.getString("place_images"));
				pVo.setPlace_hour(rs.getString("place_hour"));
				pVo.setPlace_park(rs.getString("place_park"));
				pVo.setPlace_phone(rs.getString("place_phone"));
				pVo.setPlace_address(rs.getString("place_address"));
				
				list.add(pVo);
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
	
	// �������� ã��
	public ArrayList<PlaceVO> getTypeProducts(String place_type) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		PlaceVO pVo = null;
		
		// �ش� ���� ���ϴ� ��� ���������� ��ȯ
		String sql = "select * from place where place_type=?";
		
		ArrayList<PlaceVO> list = new ArrayList<PlaceVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, place_type);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pVo = new PlaceVO();
				
				pVo.setPlace_number(rs.getInt("place_number"));
				pVo.setPlace_name(rs.getString("place_name"));
				pVo.setPlace_location(rs.getString("place_location"));
				pVo.setPlace_type(rs.getString("place_type"));
				pVo.setPlace_tema(rs.getString("place_tema"));
				pVo.setPlace_content(rs.getString("place_content"));
				pVo.setPlace_images(rs.getString("place_images"));
				pVo.setPlace_hour(rs.getString("place_hour"));
				pVo.setPlace_park(rs.getString("place_park"));
				pVo.setPlace_phone(rs.getString("place_phone"));
				pVo.setPlace_address(rs.getString("place_address"));
				
				list.add(pVo);
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
	
	// �׸����� ã��
	public ArrayList<PlaceVO> getTemaProducts(String place_tema) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		PlaceVO pVo = null;
		
		// �ش� ���� ���ϴ� ��� ���������� ��ȯ
		String sql = "select * from place where place_tema=?";
		
		ArrayList<PlaceVO> list = new ArrayList<PlaceVO>();

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, place_tema);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pVo = new PlaceVO();
				
				pVo.setPlace_number(rs.getInt("place_number"));
				pVo.setPlace_name(rs.getString("place_name"));
				pVo.setPlace_location(rs.getString("place_location"));
				pVo.setPlace_type(rs.getString("place_type"));
				pVo.setPlace_tema(rs.getString("place_tema"));
				pVo.setPlace_content(rs.getString("place_content"));
				pVo.setPlace_images(rs.getString("place_images"));
				pVo.setPlace_hour(rs.getString("place_hour"));
				pVo.setPlace_park(rs.getString("place_park"));
				pVo.setPlace_phone(rs.getString("place_phone"));
				pVo.setPlace_address(rs.getString("place_address"));
				
				list.add(pVo);
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
	
	// ������ ���� ��ȣ�� ã��
	public PlaceVO getPlaceByNumber(int place_number) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select * from place where place_number=?";
		PlaceVO pVo = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, place_number);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				pVo = new PlaceVO();
				
				pVo.setPlace_number(rs.getInt("place_number"));
				pVo.setPlace_name(rs.getString("place_name"));
				pVo.setPlace_location(rs.getString("place_location"));
				pVo.setPlace_type(rs.getString("place_type"));
				pVo.setPlace_tema(rs.getString("place_tema"));
				pVo.setPlace_content(rs.getString("place_content"));
				pVo.setPlace_images(rs.getString("place_images"));
				pVo.setPlace_hour(rs.getString("place_hour"));
				pVo.setPlace_park(rs.getString("place_park"));
				pVo.setPlace_phone(rs.getString("place_phone"));
				pVo.setPlace_address(rs.getString("place_address"));
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
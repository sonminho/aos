package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.ResponseDTO;
import util.DBManager;

public class ResponseDAO {
	private static ResponseDAO instance = new ResponseDAO();
	
	private ResponseDAO() {
		
	}
	
	public static ResponseDAO getInstance() {
		return instance;
	}
	
	public int insertData(ResponseDTO rDto) {
		String sql = "insert into response(rUserid, rMsg, rDate)"
				+ " values(?, ?, ?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int result = -1;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, rDto.getrUserid());
			pstmt.setString(2, rDto.getrMsg());
			pstmt.setString(3, rDto.getrDate());
			
			result = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public List<ResponseDTO> getDataList(String userid) {
		String sql = "select * from response where rUserid = ?";
		
		List<ResponseDTO> list = new ArrayList<ResponseDTO>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
		
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ResponseDTO rDto = new ResponseDTO();
				
				rDto.setrDate(rs.getString("rDate"));
				rDto.setrMsg(rs.getString("rMsg"));
				
				list.add(rDto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}

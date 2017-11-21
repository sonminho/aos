package controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ResponseDAO;
import dto.MemberVO;
import dto.ResponseDTO;

public class WebResponseListAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		ResponseDAO rDao = ResponseDAO.getInstance();
		MemberVO mVo =  (MemberVO) session.getAttribute("loginUser");
		String userid = mVo.getUserid();
		
		List<ResponseDTO> rList = null;
		
		rList = rDao.getDataList(userid);
		
		request.setAttribute("dataList", rList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("fcm_result.jsp");
		dispatcher.forward(request, response);
	}
}

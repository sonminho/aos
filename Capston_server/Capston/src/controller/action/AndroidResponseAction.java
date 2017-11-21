package controller.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ResponseDAO;
import dto.ResponseDTO;

public class AndroidResponseAction implements Action {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		int result = -1;
		PrintWriter out = response.getWriter();
		
		ResponseDAO rDao = ResponseDAO.getInstance();
		ResponseDTO rDto = new ResponseDTO();
		
		//HttpSession session = request.getSession();
		
		//mVo = (MemberVO) session.getAttribute("loginUser");
		
		String rMsg = request.getParameter("rMsg");
		String rUserid = request.getParameter("rUserid");
		
		Calendar now = Calendar.getInstance();
		String rDate = now.getTime().toString();
		
		rDto.setrMsg(rMsg);
		rDto.setrUserid(rUserid);
		rDto.setrDate(rDate);
		
		// ��û���� �����͸� �����ͺ��̽��� �߰�
		result = rDao.insertData(rDto);
		
		System.out.println("���� �����  = " + rUserid);
		System.out.println("�ȵ���̵忡�� ���� �޼���  = " + rMsg);
		
		out.print(result);
	}
}

package controller.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

//�ش� ���̵� ������ DB�� �����ϸ� 1 ������ -1
public class AndroidIDCheckAction implements Action {
	PrintWriter out;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberDAO mDao = MemberDAO.getInstance();
		int resultCode = 0;
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		out = response.getWriter();
		
		String requestId = request.getParameter("userid");
		
		resultCode = mDao.confirmID(requestId);
		
		out.print(resultCode);
	}
}

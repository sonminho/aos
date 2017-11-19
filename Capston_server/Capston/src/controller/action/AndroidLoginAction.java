package controller.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberVO;

public class AndroidLoginAction implements Action{
	PrintWriter out;
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDAO mDao = MemberDAO.getInstance();
		MemberVO mVo = new MemberVO();
		int result = -1;
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		out = response.getWriter();
		
		mVo.setToken(request.getParameter("token"));
		mVo.setUserid(request.getParameter("userid"));
		mVo.setPwd(request.getParameter("pwd"));
		
		result = mDao.loginMember(mVo);
		
		out.println(result);
	}

}

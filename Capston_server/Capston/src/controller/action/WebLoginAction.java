package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import dto.MemberVO;

public class WebLoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDAO mDao = MemberDAO.getInstance();
		MemberVO mVo = new MemberVO();
		int result = -1;
		String url = "login.jsp";
		
		mVo.setUserid(request.getParameter("id"));
		mVo.setPwd(request.getParameter("pw"));
		
		result = mDao.webLoginMember(mVo);
		
		System.out.println(result);
		
		if(result == 1) {
			// 사용자 정보 가져오기
			System.out.println("계정 존재");
			mVo = mDao.getMember(mVo.getUserid());
			
			// 세션에 사용자 정보 등록
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVo);
			request.setAttribute("message", "회원가입에 성공했습니다.");
			url = "fcm_test.jsp";
		} else if(result == 0) {
			System.out.println("비밀번호 불일치");
			request.setAttribute("message", "비밀번호가 맞지 않습니다.");
		} else {
			System.out.println("존재하지 않는 계정");
			request.setAttribute("message", "존재하지 않는 회원입니다.");
		}
		
		// 지정된 url로 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
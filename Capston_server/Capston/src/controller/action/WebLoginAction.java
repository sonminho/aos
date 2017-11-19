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
			// ����� ���� ��������
			System.out.println("���� ����");
			mVo = mDao.getMember(mVo.getUserid());
			
			// ���ǿ� ����� ���� ���
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", mVo);
			request.setAttribute("message", "ȸ�����Կ� �����߽��ϴ�.");
			url = "fcm_test.jsp";
		} else if(result == 0) {
			System.out.println("��й�ȣ ����ġ");
			request.setAttribute("message", "��й�ȣ�� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�������� �ʴ� ����");
			request.setAttribute("message", "�������� �ʴ� ȸ���Դϴ�.");
		}
		
		// ������ url�� �̵�
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
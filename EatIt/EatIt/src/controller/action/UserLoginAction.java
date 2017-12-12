package controller.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import dto.UserVO;

public class UserLoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		
		int result = -1;
		String url = "login.jsp";
		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");
		
		UserDAO uDao = UserDAO.getInstance();
		UserVO uVo = null;
		
		try {
			result = uDao.userLogin(user_id, user_password);
			uVo = uDao.getUserInfo(user_id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(result == 1){
				System.out.println(uVo.getUser_id() + "�� �α��� �ϼ̽��ϴ�.");
				session.setAttribute("uLogin", uVo);
				url = "index.jsp";
			} else if(result == 0) {
				System.out.println("��й�ȣ�� Ȯ���ϼ���");
			} else {
				System.out.println("���� �����Դϴ�.");
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
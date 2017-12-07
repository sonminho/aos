package controller.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;

public class UserLoginAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		
		UserDAO uDao = UserDAO.getInstance();
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		
		int result = -1;
		String user_id = request.getParameter("id");
		String user_password = request.getParameter("pw");
		String url = "";
			
		try {
			result = uDao.userLoginCheck(user_id, user_password);
			
			if(result == 1) {
				session.setAttribute("uLogin", user_id);
				url = "/index.jsp";
			} else if(result == 0) {
				url = "/user_login.jsp";
			} else {
				url = "/user_login.jsp";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
		}
	}

}

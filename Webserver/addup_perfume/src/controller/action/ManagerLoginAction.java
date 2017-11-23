package controller.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManagerDAO;

public class ManagerLoginAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		HttpSession session = request.getSession();
		ManagerDAO mDao = ManagerDAO.getInstance();
		RequestDispatcher dispatcher = null;
		
		int result = -1;
		
		try {
			result = mDao.managerCheck(id, pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(id);
		System.out.println(pw);
		System.out.println(result);
		
		if(result == 1) {
			System.out.println("manager login ok..");
			session.setAttribute("mLogin", result);
			dispatcher = request.getRequestDispatcher("manager_home.jsp");
			dispatcher.forward(request, response);
		} else if(result == 0) {
			System.out.println("password is not correct..");
			dispatcher = request.getRequestDispatcher("manager_login.jsp");
			dispatcher.forward(request, response);
		}
	}
}
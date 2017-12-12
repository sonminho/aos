package controller.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import dto.UserVO;

/**
 * Servlet implementation class UserJoinAction
 */
@WebServlet("/UserJoinAction")
public class UserJoinAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserJoinAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		
		UserDAO uDao = UserDAO.getInstance();
		
		int result = -1;
		String url = "";
		
		String user_id = request.getParameter("user_id");
		String user_password = request.getParameter("user_password");
		String user_name = request.getParameter("user_name");
		String user_phone = request.getParameter("user_phone");
		String user_email = request.getParameter("user_email");
		
		UserVO uVo = new UserVO();
		
		uVo.setUser_id(user_id);
		uVo.setUser_password(user_password);
		uVo.setUser_name(user_name);
		uVo.setUser_phone(user_phone);
		uVo.setUser_email(user_email);
		
		try {
			result = uDao.userJoin(uVo);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(result == 1) {
				url = "login.jsp";
				System.out.println(user_id + "님 회원 가입에 성공하였습니다.");
			} else {
				url = "join_main.jsp";
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}

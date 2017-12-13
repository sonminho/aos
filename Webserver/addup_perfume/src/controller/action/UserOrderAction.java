package controller.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;
import dao.UserDAO;
import dto.ProductVO;
import dto.UserVO;

public class UserOrderAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		UserDAO uDao = UserDAO.getInstance();
		UserVO uVo = null;
		ProductDAO pDao = ProductDAO.getInstance();
		ProductVO pVo = null;
		
		HttpSession session = request.getSession();
		String user_id = (String) session.getAttribute("uLogin");
		String product_number = request.getParameter("product_number");
		
		
		if(user_id == null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("user_login.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		
		try {
			uVo = uDao.getUserInfo(user_id);
			pVo = pDao.getProductByNumber((int)Integer.parseInt(product_number));
			
			request.setAttribute("user", uVo);
			request.setAttribute("product", pVo);
			session.setAttribute("uLogin", user_id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("user_order.jsp");
		dispatcher.forward(request, response);
	}
}

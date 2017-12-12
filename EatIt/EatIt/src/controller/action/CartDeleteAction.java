package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CartDAO;

public class CartDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		CartDAO cDao = CartDAO.getInstance();
		
		String cart_id = request.getParameter("cart_id");
		String cart_number = request.getParameter("cart_number");
		
		try {
			cDao.deleteCartByNumber(cart_id, cart_number);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ControllerServlet?command=cart_list");
		dispatcher.forward(request, response);
	}

}

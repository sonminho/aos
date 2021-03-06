package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;

public class ManagerDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String product_number = request.getParameter("product_number");
		
		ProductDAO pDao = ProductDAO.getInstance();
		
		try {
			pDao.deleteProduct(product_number);
			
			System.out.println(product_number +"번 제품을 삭제하였습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("manager_list.jsp");
		dispatcher.forward(request, response);
	}
}

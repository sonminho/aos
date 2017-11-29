package controller.action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dto.ProductVO;

public class ManagerUpdateAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String product_number = request.getParameter("product_number");
		
		ProductDAO pDao = ProductDAO.getInstance();
		
		try {
			ProductVO pVo = pDao.selectByProductNumber(product_number);
			
			request.setAttribute("product", pVo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("manager_update.jsp");
		dispatcher.forward(request, response);
	}
}

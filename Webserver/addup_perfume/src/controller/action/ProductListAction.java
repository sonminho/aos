package controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dto.ProductVO;

public class ProductListAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		ProductDAO pDao = ProductDAO.getInstance();
		ArrayList<ProductVO> list = null;
		
		String param = request.getParameter("category");
		String category = "";
		
		if(param.equals("man")) {
			category = "����";
		} else if(param.equals("woman")) {
			category = "����";
		}
		
		try {
			System.out.println(category);
			list = pDao.getProductsBySexCategory(category);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("product_list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("product_list.jsp");
		dispatcher.forward(request, response);
	}
}

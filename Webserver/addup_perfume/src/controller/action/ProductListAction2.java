package controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDAO;
import dto.ProductVO;

public class ProductListAction2 implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ProductDAO pDao = ProductDAO.getInstance();
		ArrayList<ProductVO> list = null;
		
		String param = request.getParameter("category");
		String category = "";
		
		if(param.equals("perfume")) {
			category = "��Ǿ";
		} else if(param.equals("eaudeperfume")) {
			category = "������Ǿ";
		} else if(param.equals("eaudecologne")){
			category = "�����ݷδ�";
		}
		
		try {
			System.out.println(category);
			list = pDao.getProductByLevelCategory(category);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("product_list", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("product_list2.jsp");
		dispatcher.forward(request, response);
	}
}

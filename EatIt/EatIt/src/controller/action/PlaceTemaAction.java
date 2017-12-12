package controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlaceDAO;
import dto.PlaceVO;

public class PlaceTemaAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		PlaceDAO pDao = PlaceDAO.getInstance();
		ArrayList<PlaceVO> list = null;
		
		String tema = request.getParameter("tema");
		String place_tema = "";
		
		System.out.println("요청 종류: " + tema);
		
		if(tema.equals("date")) {
			place_tema = "데이트";
		} else if(tema.equals("family")) {
			place_tema = "가족";
		} else if(tema.equals("bussiness")) {
			place_tema = "비지니스";
		}
		
		try {
			list = pDao.getTemaProducts(place_tema);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("place_list", list);
		request.setAttribute("place_tema", place_tema);
		RequestDispatcher dispatcher = request.getRequestDispatcher("tema_search.jsp");
		dispatcher.forward(request, response);
	}

}

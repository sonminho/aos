package controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlaceDAO;
import dto.PlaceVO;

public class PlaceLocationAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		
		PlaceDAO pDao = PlaceDAO.getInstance();
		ArrayList<PlaceVO> list = null;
		
		String location = request.getParameter("location");
		String place_location = "";
		
		System.out.println("요청 지역 : " + location);
		
		if(location.equals("nowongu")) {
			place_location = "노원구";
		} else if(location.equals("gangseogu")) {
			place_location = "강서구";
		}
		
		try {
			list = pDao.getLocalProducts(place_location);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("place_list", list);
		request.setAttribute("place_location", place_location);
		RequestDispatcher dispatcher = request.getRequestDispatcher("local_search.jsp");
		dispatcher.forward(request, response);
	}
}

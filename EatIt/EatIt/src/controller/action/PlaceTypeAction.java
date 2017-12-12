package controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlaceDAO;
import dto.PlaceVO;

public class PlaceTypeAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		PlaceDAO pDao = PlaceDAO.getInstance();
		ArrayList<PlaceVO> list = null;
		
		String type = request.getParameter("type");
		String place_type = "";
		
		System.out.println("요청 종류: " + type);
		
		if(type.equals("hansik")) {
			place_type = "한식";
		} else if(type.equals("ilsik")) {
			place_type = "일식";
		} else if(type.equals("yangsik")) {
			place_type = "양식";
		} else if(type.equals("joongsik")) {
			place_type = "중식";
		}
		
		try {
			list = pDao.getTypeProducts(place_type);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("place_list", list);
		request.setAttribute("place_type", place_type);
		RequestDispatcher dispatcher = request.getRequestDispatcher("type_search.jsp");
		dispatcher.forward(request, response);
		
	}

}

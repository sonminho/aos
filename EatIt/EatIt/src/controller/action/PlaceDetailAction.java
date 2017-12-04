package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlaceDAO;
import dto.PlaceVO;

public class PlaceDetailAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int place_number = (int)Integer.valueOf(request.getParameter("place_number"));
		
		System.out.println(place_number);
		
		PlaceDAO pDao = PlaceDAO.getInstance();
		PlaceVO pVo = null;
		
		try {
			pVo = pDao.getPlaceByNumber(place_number);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		request.setAttribute("place", pVo);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("place_detail.jsp");
		dispatcher.forward(request, response);
	}
}

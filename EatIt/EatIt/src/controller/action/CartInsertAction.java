package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CartDAO;
import dao.PlaceDAO;
import dto.CartVO;
import dto.PlaceVO;
import dto.UserVO;

public class CartInsertAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		PlaceDAO pDao = PlaceDAO.getInstance();
		PlaceVO pVo = null;
		CartDAO cDao = CartDAO.getInstance();
		CartVO cVo = null;
		
		// 세션에서 로그인된 사용자 정보 받아오기
		HttpSession session = request.getSession();
		UserVO uVo = (UserVO)session.getAttribute("uLogin");
		
		if(uVo == null) {
			System.out.println("로그인 하지 않은 회원입니다.");
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
			
			return;
		}
		
		int result = -1;
		String place_number = request.getParameter("place_number");
		
		try {
			pVo = pDao.getPlaceByNumber(Integer.parseInt(place_number));
			cVo = new CartVO();
			
			cVo.setCart_number(pVo.getPlace_number());
			cVo.setCart_name(pVo.getPlace_name());
			cVo.setCart_type(pVo.getPlace_type());
			cVo.setCart_content(pVo.getPlace_content());
			cVo.setCart_id(uVo.getUser_id());
			
			// 이미 즐겨찾기에 있음
			if(cDao.checkCart(cVo) == 1) {
				System.out.println("이미 즐겨찾기에 있음");
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("ControllerServlet?command=cart_list");
				dispatcher.forward(request, response);
			}
			
			result = cDao.insertCart(cVo);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(result > 0) {
			System.out.println("즐겨찾기 추가 성공");
		} else {
			System.out.println("즐겨찾기 추가 실패");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ControllerServlet?command=cart_list");
		dispatcher.forward(request, response);
	}
}
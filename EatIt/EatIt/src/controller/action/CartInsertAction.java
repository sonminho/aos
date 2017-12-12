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
		
		// ���ǿ��� �α��ε� ����� ���� �޾ƿ���
		HttpSession session = request.getSession();
		UserVO uVo = (UserVO)session.getAttribute("uLogin");
		
		if(uVo == null) {
			System.out.println("�α��� ���� ���� ȸ���Դϴ�.");
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
			
			// �̹� ���ã�⿡ ����
			if(cDao.checkCart(cVo) == 1) {
				System.out.println("�̹� ���ã�⿡ ����");
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("ControllerServlet?command=cart_list");
				dispatcher.forward(request, response);
			}
			
			result = cDao.insertCart(cVo);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		if(result > 0) {
			System.out.println("���ã�� �߰� ����");
		} else {
			System.out.println("���ã�� �߰� ����");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ControllerServlet?command=cart_list");
		dispatcher.forward(request, response);
	}
}
package controller.action;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.OrderDAO;
import dao.ProductDAO;
import dao.UserDAO;
import dto.OrderVO;
import dto.ProductVO;
import dto.UserVO;
/**
 * Servlet implementation class UserOrderAction2
 */
@WebServlet("/UserOrderAction2")
public class UserOrderAction2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserOrderAction2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		HttpSession session =request.getSession();
		
		ProductDAO pDao = ProductDAO.getInstance();
		ProductVO pVo;
		
		UserDAO uDao = UserDAO.getInstance();
		UserVO uVo;
		
		OrderDAO oDao = OrderDAO.getInstance();
		OrderVO oVo;
		
		String user_id = (String) session.getAttribute("uLogin");
		String product_number = request.getParameter("product_number");
		String new_address = request.getParameter("new_address");
		Calendar now = Calendar.getInstance();
		String order_date = now.getTime().toString();
		
		int result = -1;
		
		try {
			pVo = pDao.getProductByNumber((int)Integer.parseInt(product_number));
			uVo = uDao.getUserInfo(user_id);
			
			oVo = new OrderVO();
			
			oVo.setOrder_name(uVo.getUser_name());
			oVo.setOrder_address(new_address);
			oVo.setOrder_date(order_date);
			oVo.setOrder_product_number(pVo.getProductNumber());
			oVo.setOrder_price(pVo.getProductPrice());
			oVo.setOrder_product_name(pVo.getProductName());
			oVo.setOrder_id(user_id);
			
			result = oDao.insertOrder(oVo);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
}

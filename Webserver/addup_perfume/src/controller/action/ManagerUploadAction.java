package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.ProductDAO;

public class ManagerUploadAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		
		String upload = request.getRealPath("upload_image");
		String url = "";
		
		int maxSize = 1024*1024*10;
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		try {
			MultipartRequest multi = new MultipartRequest(request, upload
					, maxSize, "UTF-8", new DefaultFileRenamePolicy());
			
			ProductDAO pDao = ProductDAO.getInstance();
			int result = pDao.registerProduct(multi);
			
			// 상품 등록 성공
			if(result > 0) {
				url = "manager_home.jsp";
			} else {
				url = "manager_register.jsp";
			}
			
			// 해당 url로 이동
			dispatcher.forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

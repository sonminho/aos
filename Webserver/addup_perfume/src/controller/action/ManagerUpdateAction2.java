package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import dao.ProductDAO;
import dto.ProductVO;

public class ManagerUpdateAction2 implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String upload = request.getRealPath("upload_image");
		String url = "";
		
		int maxSize = 1024*1024*20;		// ���ε� �뷮 �ִ� 10MB�� ����
		
		System.out.println("���ε�� �̹��� ���" + upload);
		
		try {
			MultipartRequest multi = new MultipartRequest(request, upload
					, maxSize, "EUC-KR", new DefaultFileRenamePolicy());
			
			ProductDAO pDao = ProductDAO.getInstance();
			int result = pDao.updateProduct(multi);
			
			System.out.println(result);
			
			// ��ǰ ���� ����
			if(result > 0) {
				url = "manager_list.jsp";
			} else {
				url = "manager_home.jsp";
			}
			System.out.println(url);

			// �ش� url�� �̵�
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
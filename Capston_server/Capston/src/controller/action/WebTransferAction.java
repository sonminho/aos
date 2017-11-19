package controller.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import dao.MemberDAO;
import dto.MemberVO;

public class WebTransferAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		MemberDAO mDao = MemberDAO.getInstance();
		MemberVO mVo = new MemberVO();
		
		request.setCharacterEncoding("UTF-8");
		
		// 로그인된 사용자 정보를 세션으로부터 받아온다
		HttpSession session = request.getSession();
		mVo = (MemberVO) session.getAttribute("loginUser");
		
		// 전송할 메시지 타입
		String selected = request.getParameter("transfer_select");
		
		// System.out.println(selected);
		// System.out.println("토큰정보 " + mVo.getToken());
		
		try {
			URL url = new URL("https://fcm.googleapis.com/fcm/send");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setDefaultUseCaches(false);
            conn.setDoInput(true);  // 서버에서 읽기 모드 지정
            conn.setDoOutput(true); // 서버로 쓰기 모드 지정
            conn.setRequestMethod("POST");  // 전송방식

            // json형식, 서버키 값 설정
            conn.setRequestProperty("content-type", "application/json");
            conn.setRequestProperty("Authorization", "key=AAAAYE90G8Q:APA91bFDn5dIyvewfd2ffbR5GB7QB9ONTZKp1eK61TmE10aWFV1SVNyMwYETNpOdK1u7PEuBQpBS2kXa435tt2MpojiIfcuuTElbkigQNWISpHh_BF7riM-w1UILDPOle4W-sibhdg0u");
       
            JSONObject obj = new JSONObject();
            
            obj.put("to", mVo.getToken());
            JSONObject subObj = new JSONObject();
            subObj.put("message", selected);
            obj.put("data", subObj);
            
            String str = obj.toString();
            
            // 서버로 전송하고 버퍼 비움
            OutputStreamWriter outputStream = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            PrintWriter writer = new PrintWriter(outputStream);
            writer.write(obj.toString());
            writer.flush();

            // 서버에서 전송받기
            InputStream inputStream = conn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String result = bufferedReader.readLine();
            
            System.out.println(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("fcm_test.jsp");
		dispatcher.forward(request, response);
	}
}

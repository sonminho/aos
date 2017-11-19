import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class Fcm {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://fcm.googleapis.com/fcm/send");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setDefaultUseCaches(false);
            conn.setDoInput(true);  // �������� �б� ��� ����
            conn.setDoOutput(true); // ������ ���� ��� ����
            conn.setRequestMethod("POST");  // ���۹��

            // �������� ������ <Form>���� ���� �Ѿ�� �Ͱ� ���� ������� ó���϶�� ���� �˷���
            conn.setRequestProperty("content-type", "application/json");
            conn.setRequestProperty("Authorization", "key=AAAAYE90G8Q:APA91bFDn5dIyvewfd2ffbR5GB7QB9ONTZKp1eK61TmE10aWFV1SVNyMwYETNpOdK1u7PEuBQpBS2kXa435tt2MpojiIfcuuTElbkigQNWISpHh_BF7riM-w1UILDPOle4W-sibhdg0u");
       
            JSONObject obj = new JSONObject();
            
            obj.put("to", "dM3xnaD_Sjo:APA91bGQWg1MyxqrIDrHK5zNsICmAz2dL_MG-tjDpdjwZSc0HfhQ29ehAr8GqvVUEt6pa11Tss5BhM7prbYFZROT_SZQExRhJ-QSisXR5vcDvuq2zNQ12zBFMtwsKEfTd-XFXROYHxNl");
            JSONObject subObj = new JSONObject();
            subObj.put("message", "��ȯ�����׸�");
            obj.put("data", subObj);
            
            
            String str = obj.toString();
            StringBuffer buffer = new StringBuffer();
            buffer.append("");
            
            // ������ �����ϰ� ���� ���
            OutputStreamWriter outputStream = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            PrintWriter writer = new PrintWriter(outputStream);
            writer.write(obj.toString());
            writer.flush();

            // �������� ���۹ޱ�
            InputStream inputStream = conn.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String result = bufferedReader.readLine();
            
            System.out.println(result);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

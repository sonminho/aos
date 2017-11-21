package sm2no.myapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.PowerManager;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 01020072846 on 2017-10-03.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From : " + remoteMessage.getFrom());

        if(remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload : " + remoteMessage.getData());
        }

        sendNotification(remoteMessage);
    }

    private void sendNotification(RemoteMessage message) {
        System.out.println("received msg : " + message);
        try {
            JSONObject jsonObject = new JSONObject(message.getData());
            String msg = jsonObject.get("message").toString();

            if(msg.equals("where")) {
                Log.d("msg", "위치정보 파악하자");
                PositionTask pTask = new PositionTask();
                pTask.execute("강남구", "smh1992");
            } else if(msg.equals("")) {

            } else if(msg.equals("camera")) {

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public class PositionTask extends AsyncTask<String, Void, String> {
        String url = null;
        String result = "-1";

        @Override
        protected String doInBackground(String... params) {
            try {
                URL url = new URL("http://192.168.0.2:8080/Capston/AndroidServlet?command=android_response");

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();


                conn.setDefaultUseCaches(false);
                conn.setDoInput(true);  // 서버에서 읽기 모드 지정
                conn.setDoOutput(true); // 서버로 쓰기 모드 지정
                conn.setRequestMethod("POST");  // 전송방식

                // 서버에게 웹에서 <Form>으로 값이 넘어온 것과 같은 방식으로 처리하라는 것을 알려줌
                conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");

                // 서버로 값 전송할 데이터
                StringBuffer buffer = new StringBuffer();
                buffer.append("rMsg").append("=").append(params[0]).append("&");
                buffer.append("rUserid").append("=").append(params[1]);

                // 서버로 전송하고 버퍼 비움
                OutputStreamWriter outputStream = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
                PrintWriter writer = new PrintWriter(outputStream);
                writer.write(buffer.toString());
                writer.flush();

                // 서버에서 전송받기
                InputStream inputStream = conn.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                result = bufferedReader.readLine();

            } catch (Exception e) {
                e.printStackTrace();
            }

            return result;
        }

        @Override
        protected void onPostExecute(String result) {
            if(result.equals("1")) {
                Toast.makeText(getApplicationContext(), "서버요청에 응답하였습니다.", Toast.LENGTH_SHORT).show();
            } else {

            }
        }
    }
}

package sm2no.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoginActivity extends AppCompatActivity {
    EditText loginIdEditText, loginPassEditText;
    Button loginButton, joinButton;

    Intent intent;

    LoginAsyncTask loginAsyncTask = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginIdEditText = (EditText) findViewById(R.id.loginIdEditText);
        loginPassEditText = (EditText) findViewById(R.id.loginPassEditText);

        loginButton = (Button) findViewById(R.id.login_btn);
        joinButton = (Button) findViewById(R.id.join_btn);

        intent = new Intent(this, JoinActivity.class);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginAsyncTask = new LoginAsyncTask();
                loginAsyncTask.execute(FirebaseInstanceId.getInstance().getToken().toString(),
                        loginIdEditText.getText().toString(),
                        loginPassEditText.getText().toString());
            }
        });

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                finish();
            }
        });


    }

    public class LoginAsyncTask extends AsyncTask<String, Void, Integer> {

        @Override
        protected Integer doInBackground(String... params) {
            String result = null;

            try {
                URL url = new URL("http://192.168.0.14:8080/Capston/AndroidServlet?command=android_login");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                conn.setDefaultUseCaches(false);
                conn.setDoInput(true);  // 서버에서 읽기 모드 지정
                conn.setDoOutput(true); // 서버로 쓰기 모드 지정
                conn.setRequestMethod("POST");  // 전송방식

                // 서버에게 웹에서 <Form>으로 값이 넘어온 것과 같은 방식으로 처리하라는 것을 알려줌
                conn.setRequestProperty("content-type", "application/x-www-form-urlencoded");

                // 서버로 값 전송할 데이터
                StringBuffer buffer = new StringBuffer();
                buffer.append("token").append("=").append(params[0]).append("&");
                buffer.append("userid").append("=").append(params[1]).append("&");
                buffer.append("pwd").append("=").append(params[2]);
                
                // 서버로 전송하고 버퍼 비움
                OutputStreamWriter outputStream = new OutputStreamWriter(conn.getOutputStream(), "EUC-KR");
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
            
            // 박싱해서 리턴
            return Integer.parseInt(result);
        }
        
        @Override
        protected void onPostExecute(Integer result) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);

            if(result.intValue() == 1) {
                Toast.makeText(LoginActivity.this, "로그인 되었습니다.", Toast.LENGTH_SHORT).show();
                intent.putExtra("userid", loginIdEditText.getText().toString());
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(LoginActivity.this, "계정을 다시 확인해주세요.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}

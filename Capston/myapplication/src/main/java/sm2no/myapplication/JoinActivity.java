package sm2no.myapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class JoinActivity extends AppCompatActivity {
    Button joinIdCheckButton, joinOkButton, joinReturnButton;
    EditText joinIdEditText, joinPassEditText, joinPassCheckEditText,
            joinEmailEditText, joinPhoneEditText;

    Intent loginIntent;
    String idCheckResult = null;
    IdCheckAsyncTask task = null;
    JoinAsyncTask joinTask = null;

    boolean idCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);


        loginIntent = new Intent(this, LoginActivity.class);

        idCheck = false;

        joinOkButton = (Button) findViewById(R.id.join_ok_btn);
        joinReturnButton = (Button) findViewById(R.id.join_return_btn);
        joinIdCheckButton = (Button) findViewById(R.id.join_id_check_btn);
        joinIdEditText = (EditText) findViewById(R.id.joinIddEditText);
        joinPassEditText = (EditText) findViewById(R.id.joinPassEditText);
        joinPassCheckEditText =(EditText) findViewById(R.id.joinPassCheckEditText);
        joinEmailEditText = (EditText) findViewById(R.id.joinEmailEditText);
        joinPhoneEditText = (EditText) findViewById(R.id.joinPhoneEditText);

        joinOkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(joinIdEditText.getText().toString().equals("")
                        || joinPassEditText.getText().toString().equals("")
                        || joinPassCheckEditText.getText().toString().equals("")
                        || joinEmailEditText.getText().toString().equals("")
                        || joinPhoneEditText.getText().toString().equals("")) {
                    Toast.makeText(JoinActivity.this, "빈칸을 입력해주세요.", Toast.LENGTH_SHORT).show();

                    return;
                }

                if(!(joinPassEditText.getText().toString().
                        equals(joinPassCheckEditText.getText().toString()))) {
                    Toast.makeText(JoinActivity.this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show();
                    joinPassEditText.setText("");
                    joinPassCheckEditText.setText("");

                    return;
                }

                if(idCheck == false) {
                    Toast.makeText(JoinActivity.this, "ID 중복체크를 해주세요.", Toast.LENGTH_SHORT).show();
                }

                if(idCheck == true) {
                    joinTask = new JoinAsyncTask();
                    joinTask.execute(FirebaseInstanceId.getInstance().getToken().toString(),
                            joinIdEditText.getText().toString(),
                            joinPassEditText.getText().toString(),
                            joinEmailEditText.getText().toString(),
                            joinPhoneEditText.getText().toString());
                }

            }
        });

        joinIdCheckButton.setOnClickListener(new View.OnClickListener() {
            String id = null;

            @Override
            public void onClick(View v) {
                if(joinIdEditText.getText().toString().equals("")) {
                    Toast.makeText(JoinActivity.this, "아이디를 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                id = joinIdEditText.getText().toString();

                task = new IdCheckAsyncTask();
                task.execute(id);

            }
        });

        joinReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(loginIntent);
                finish();
            }
        });
    }

    public class IdCheckAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                URL url = new URL("http://192.168.0.2:8080/Capston/AndroidServlet?command=android_idCheck&userid="+params[0]);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.connect();

                InputStream inputStream = conn.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));


                idCheckResult = bufferedReader.readLine().toString().trim();

                Log.d("test1", "서버 응답 " + idCheckResult);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return idCheckResult;
        }

        @Override
        protected void onPostExecute(String resultCode) {
            if(resultCode.equals("1")) {
                Toast.makeText(JoinActivity.this, "이미 존재하는 아이디 입니다.", Toast.LENGTH_SHORT).show();

            } else if(resultCode.equals("-1")){
                Toast.makeText(JoinActivity.this, "사용할 수 있는 아이디 입니다.", Toast.LENGTH_SHORT).show();
                idCheck = true;
                joinIdCheckButton.setClickable(true);
                joinIdEditText.setFocusable(false);
            }
        }
    }

    public class JoinAsyncTask extends AsyncTask<String, Void, Integer> {
        
        @Override
        protected Integer doInBackground(String... params) {
            String result = null;
            
            try {

                URL url = new URL("http://192.168.0.2:8080/Capston/AndroidServlet?command=android_join");
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
                buffer.append("pwd").append("=").append(params[2]).append("&");
                buffer.append("email").append("=").append(params[3]).append("&");
                buffer.append("phone").append("=").append(params[4]);

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

            return Integer.parseInt(result);
        }

        @Override
        protected void onPostExecute(Integer result) {
            if(result.intValue() == 1) {
                Toast.makeText(JoinActivity.this, "가입을 환영합니다.", Toast.LENGTH_SHORT).show();
                startActivity(loginIntent);
                finish();
            } else {
                Toast.makeText(JoinActivity.this, "가입에 실패하였습니다.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
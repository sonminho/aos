package sm2no.wheisphone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;

public class LoginActivity extends AppCompatActivity {
    EditText loginIdEditText, loginPassEditText;
    Button loginButton, joinButton;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginIdEditText = (EditText) findViewById(R.id.loginIdEditText);
        loginPassEditText = (EditText) findViewById(R.id.loginPassEditText);

        loginButton = (Button) findViewById(R.id.login_btn);
        joinButton = (Button) findViewById(R.id.join_btn);

        intent = new Intent(this, JoinActivity.class);

        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
                finish();
            }
        });

        String token = FirebaseInstanceId.getInstance().getToken().toString();
    }
}

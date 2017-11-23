package sm2no.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    // GPSTracker class
    private GpsInfo gps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.main_text);
        gps = new GpsInfo(this);

        Intent intent = getIntent();

        String str = intent.getStringExtra("userid");

        textView.setText(str + "님 로그인 되었습니다.");
    }
}

package sm2no.myapplication1;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AudioManager mAudioManager;

    Button btn, btn2, btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sount_mode_check();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                sount_mode_check();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                sount_mode_check();
            }
        });
    }

    public void sount_mode_check() {
        switch (mAudioManager.getRingerMode()) {
            case AudioManager.RINGER_MODE_NORMAL:
                Toast.makeText(this, "정상모드", Toast.LENGTH_SHORT).show();
                break;
            case AudioManager.RINGER_MODE_SILENT:
                Toast.makeText(this, "무음모드", Toast.LENGTH_SHORT).show();
                break;
            case AudioManager.RINGER_MODE_VIBRATE:
                Toast.makeText(this, "벨소리모드", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}

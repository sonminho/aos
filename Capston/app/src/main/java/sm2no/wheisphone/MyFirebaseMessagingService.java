package sm2no.wheisphone;

import android.app.Service;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by 01020072846 on 2017-09-30.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "MyFirebaseMsgService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From : " + remoteMessage.getFrom());

        if(remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Message data payload : " + remoteMessage.getData());
        }

        if(remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body : " + remoteMessage.getNotification());
            sendNotification(remoteMessage);
        }
    }

    private void sendNotification(RemoteMessage remoteMessage) {
        Log.d(TAG, "FCM 서버에서 온 메세지 " + remoteMessage.getNotification().getBody());
    }
}

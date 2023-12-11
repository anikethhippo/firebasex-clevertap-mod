package com.androidfcm.cordova;
import com.clevertap.android.sdk.pushnotification.NotificationInfo;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.util.Log;
import java.util.Map;

public class CustomFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "custom-fcm-service";

   
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // Add your custom native code here
        Map<String, String> data = remoteMessage.getData();
        if (data != null) {
            CTFcmMessageHandler().createNotification(getApplicationContext(), message);
    
            
        }
    }

    /*@Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        // Send token to server
        if (includesWebEngage()) {
            com.webengage.sdk.android.WebEngage.get().setRegistrationID(s);
        }
    }*/
}
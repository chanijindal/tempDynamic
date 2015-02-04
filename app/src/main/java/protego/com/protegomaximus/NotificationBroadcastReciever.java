package protego.com.protegomaximus;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

/**
 * Created by chanijindal on 03/02/15.
 */
public class NotificationBroadcastReciever extends BroadcastReceiver {
    @Override


    public void onReceive(Context context, Intent intent) {

         int notification_number=0;
        NotificationCompat.Builder  mBuilder =
                new NotificationCompat.Builder(context);
        mBuilder.setAutoCancel(true);
        mBuilder.setSmallIcon(R.drawable.ic_launcher);
        mBuilder.setContentTitle("New Message");
        mBuilder.setContentText("Anomaly detected");
        mBuilder.setNumber(++notification_number);
        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);


        mNotificationManager.notify(0 ,mBuilder.build());

        //Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();

    }
}

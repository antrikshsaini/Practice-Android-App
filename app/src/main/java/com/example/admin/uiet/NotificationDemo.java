package com.example.admin.uiet;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;

public class NotificationDemo extends AppCompatActivity {
    NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_demo);
    
    }
    public void generate(View v){


        Intent notificationIntent = new Intent(this,NotificationDemo.class);

        PendingIntent contentIntent=PendingIntent.getActivity(this,0,notificationIntent,0);

        NotificationCompat.Builder build1= new NotificationCompat.Builder(NotificationDemo.this)

                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("Notification Examplel")
                .addAction(R.mipmap.ic_launcher,"Callback",contentIntent)
                .addAction(R.mipmap.ic_launcher,"Back",contentIntent)
                .addAction(R.mipmap.ic_launcher,"Decline",contentIntent)
                .setContentText("This is a notification")
                .setContentIntent(contentIntent).setAutoCancel(true);




        manager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        manager.notify(0,build1.build());

    }

}

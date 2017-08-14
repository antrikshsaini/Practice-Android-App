package com.example.admin.uiet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {


       /* if (intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED")) {

            Toast.makeText(context, "Received", Toast.LENGTH_SHORT).show();

        }
        else if(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
        {
            Toast.makeText(context, "Detected", Toast.LENGTH_SHORT).show();

        }
        else
        {
            Toast.makeText(context, "Detected", Toast.LENGTH_SHORT).show();

        }*/

        //MediaPlayer mp =MediaPlayer.create(Context)

        Toast.makeText(context,"Receiver message",Toast.LENGTH_SHORT).show();

    }
}

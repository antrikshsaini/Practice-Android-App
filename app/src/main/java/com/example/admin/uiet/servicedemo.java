package com.example.admin.uiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class servicedemo extends AppCompatActivity {
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicedemo);




    }
    public void start(View v)
    {
        Button b1 = (Button) findViewById(R.id.button1);

        Intent i = new Intent(this,myservicedemo.class);

        startService(i);

    }
    public  void stop(View v)
    {
        Intent i = new Intent(this,myservicedemo.class);
        Button b2 = (Button) findViewById(R.id.button2);
        stopService(i);
    }

}

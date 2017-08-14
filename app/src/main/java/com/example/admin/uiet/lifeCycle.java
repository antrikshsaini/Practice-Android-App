package com.example.admin.uiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class lifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle2);


        Log.d("LifeCycle","created");
    }

    @Override
    protected void onStart() {
        Log.d("LifeCyle","Started");

        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("LifeCyle","Resumed");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("LifeCyle","paused");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("LifeCyle","Stopped");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d("LifeCyle","Restarted");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("LifeCyle","Destroyed");
        super.onDestroy();
    }


}

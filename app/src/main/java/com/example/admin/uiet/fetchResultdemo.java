package com.example.admin.uiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class fetchResultdemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_resultdemo);


        Intent i =new Intent();
        i.putExtra("mydata","hiii");

        setResult(1,i);
        finish();


    }
}

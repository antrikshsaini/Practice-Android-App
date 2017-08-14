package com.example.admin.uiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dataTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer);

        Intent i = getIntent();
        String u=i.getStringExtra("username");
        TextView t=(TextView)findViewById(R.id.text5);
        t.setText(u);



    }




}

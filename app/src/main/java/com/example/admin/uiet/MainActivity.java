package com.example.admin.uiet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=(TextView)findViewById(R.id.text);

        t2=(TextView)findViewById(R.id.button2);

        Button b=(Button)findViewById(R.id.button2);

        b.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v3){
                t2.setText("CHANGED");
            }


        });

        Button b2=(Button)findViewById(R.id.button3);

        b2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v4){


                Toast.makeText(MainActivity.this,"Ohh!! i was clicked", Toast.LENGTH_SHORT).show();

            }


        });
    }




    public void doSomething(View v)  {

        t.setText("its working");


    }


    public void go(View v5){

        Intent i =new Intent(this,IntentMigration.class);
        startActivity(i);

    }



}

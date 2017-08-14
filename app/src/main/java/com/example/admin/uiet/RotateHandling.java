package com.example.admin.uiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class RotateHandling extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_handling);
        t=(TextView)findViewById(R.id.text1);
        t.setText(0+"");
        Log.d("mylog",t.getText().toString());
    }

    public void process(View v) {

        if (v.getId() == R.id.button1) {


            int i = Integer.parseInt(t.getText().toString());
            i++;
            t.setText(i + "");


        }

        if (v.getId() == R.id.button2) {


            int i = Integer.parseInt(t.getText().toString());
            i--;
            t.setText(i + "");


        }


    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        int i2=Integer.parseInt(t.getText().toString());
        outState.putString("previousdata",i2+"");



    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        String data=savedInstanceState.getString("previousdata");
        t.setText(data);

    }
}

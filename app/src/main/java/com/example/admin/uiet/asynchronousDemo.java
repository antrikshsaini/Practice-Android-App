package com.example.admin.uiet;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class asynchronousDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asynchronous_demo);

        myTask m =new myTask();
        m.execute("hi","bye");
    }

    class myTask extends AsyncTask<String,Void,String>{


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {

            String value=strings[0] +" "+strings[1];


            return value;
        }

        @Override
        protected void onPostExecute(String s) {

            TextView t =(TextView) findViewById(R.id.text);
            t.setText(s);


            super.onPostExecute(s);
        }
    }

}

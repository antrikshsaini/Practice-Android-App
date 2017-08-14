package com.example.admin.uiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Sqlitedemo extends AppCompatActivity {
    MyDatabase mdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlitedemo);

        mdb = new MyDatabase(this);

    }
    public void callinsert(View v){

        mdb.insert(4,"antrix","antriksh@gmail.com");
        Toast.makeText(this, "Data is inserted", Toast.LENGTH_SHORT).show();

    }

    public void showdata(View v){

        mdb.getalldata();


    }
    public void updatedata12(View v){

        mdb.updatedata();


    }
    public void deletedata12(View v){

        mdb.deletedata();

    }


}

package com.example.admin.uiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class menudemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menudemo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater infiltrate= getMenuInflater();
        infiltrate.inflate(R.menu.mymenu,menu);




        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if(item.getTitle().equals("About"))

        {
            Toast.makeText(this,"About is selected",Toast.LENGTH_SHORT).show();



        }
        return super.onOptionsItemSelected(item);
    }
}

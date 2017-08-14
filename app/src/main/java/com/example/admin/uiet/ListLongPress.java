package com.example.admin.uiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListLongPress extends AppCompatActivity {


    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_long_press);

    l=(ListView) findViewById(R.id.listView);
        List<String> li= new ArrayList<>();
        li.add("Something");
        li.add("Something");
        li.add("Something");
        li.add("Something");
        li.add("Somethin sasdg");
        li.add("Somethdsaading");
        li.add("Somethinsadg");
        li.add("Something");
        li.add("Something");
        li.add("Something");

        ArrayAdapter<String> adap = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,li);
        l.setAdapter(adap);

        registerForContextMenu(l);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.mymenu,menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getTitle().equals("About"))

        {
            Toast.makeText(this,"About is selected",Toast.LENGTH_SHORT).show();



        }


        return super.onContextItemSelected(item);
    }
}

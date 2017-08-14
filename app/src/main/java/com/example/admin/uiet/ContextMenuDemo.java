package com.example.admin.uiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ContextMenuDemo extends AppCompatActivity {

    ActionMode mode;
    ActionMode.Callback call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_demo);
        View v = findViewById(R.id.activity_context_menu_demo);

        v.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                mode= startActionMode(new myaction());

                return false;
            }
        });




    }

    class myaction implements ActionMode.Callback
    {


        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {

            getMenuInflater().inflate(R.menu.mymenu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

            if(item.getTitle().equals("About"))
            {

                Toast.makeText(getApplicationContext(),item.getTitle() + " is clicked",Toast.LENGTH_SHORT).show();
                mode.finish();
            }


            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }
    }



}

package com.example.admin.uiet;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class recycleView extends AppCompatActivity {

    List<DataModel> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        makeData();
        RecyclerView r=(RecyclerView) findViewById(R.id.myrecycler);

        MyAdapter m=new MyAdapter(this,list);
        r.setLayoutManager(new LinearLayoutManager(this));
        r.setAdapter(m);



    }
    public void makeData(){
        list=new ArrayList<>();
        for(int i=0;i<10;i++){
            DataModel d=new DataModel();
            d.setTitle("Title "+i);
            d.setDesc("Desc "+i);
            d.setImageid(R.mipmap.ic_launcher);
            list.add(d);
        }
    }


}

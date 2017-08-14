package com.example.admin.uiet;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerWorking extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_working);


        s=(Spinner) findViewById(R.id.spinner);

        List<String> list=new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        ArrayAdapter<String> adap=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adap);
        s.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        String valSelected= (String) adapterView.getItemAtPosition(position);

        Toast.makeText(this,valSelected,Toast.LENGTH_SHORT).show();




    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

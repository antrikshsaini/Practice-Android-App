package com.example.admin.uiet;

import android.content.Intent;
import android.icu.text.StringPrepParseException;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.content.ClipData.newIntent;

public class IntentMigration extends AppCompatActivity {

    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_migration);


        e=(EditText) findViewById(R.id.editText);



    }

    public void sendData(View v){

        String data=e.getText().toString();

        Intent i =new Intent(this,dataTransfer.class);
        i.putExtra("username",data);
        startActivity(i);

    }

    public void openBrowser(View v7){


        String url = "http://www.google.com";
        Intent i7=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(i7);



    }
    public void phone(View v8){


        String ph="8447712122";

        Intent i8=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:"+ph));
        startActivity(i8);



    }

    public void camera(View v9){

        Intent i9=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i9);


    }
    public void getData(View v10){

        Intent i10=new Intent(this,dataTransfer.class);
        startActivityForResult(i10,1);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast t10= Toast.makeText(this,"On result called"+data.getStringExtra("mydata"), Toast.LENGTH_SHORT);
        t10.show();


    }
}

package com.example.admin.uiet;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class transfer extends AppCompatActivity {
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer);

        image=(ImageView) findViewById(R.id.imageView);



    }

    public void getdata(View v){
        Intent i =new Intent(this,fetchResultdemo.class);
        startActivityForResult(i,1);
    }
    public void getpicture(View v){

        Intent i =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap b=(Bitmap) data.getExtras().get("data");

        image.setImageBitmap(b);
    }






}

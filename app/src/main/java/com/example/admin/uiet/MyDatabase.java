package com.example.admin.uiet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Antriksh on 23-12-2016.
 */

public class MyDatabase extends SQLiteOpenHelper {

    final static int version = 3;

    public MyDatabase(Context context) {

        super(context, "mydb", null, version);
        Log.d("Database","Database Created");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String create="create table student(id integer primary key,name text,email text)";
        db.execSQL(create);

        Log.d("Database","tABLE Created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists student");
        onCreate(db);
        Log.d("Database","Upgraded");


    }

    public void insert(int ids,String myname, String myemail){

        SQLiteDatabase sq =getWritableDatabase();
        ContentValues c1 =new ContentValues();
        c1.put("id",ids);
        c1.put("name",myname);
        c1.put("email",myemail);
        sq.insert("student",null,c1);
        Log.d("Database","Values Inserted");


    }

    public void getalldata(){

        SQLiteDatabase sq1=getReadableDatabase();
        Log.d("Database","In getAll");
        Cursor c2=sq1.rawQuery("Select * from student",null);
        while(c2.moveToNext()){

           int i =c2.getInt(0);
            String n=c2.getString(1);

            String e=c2.getString(2);

            Log.d("Database",i+" "+n+" "+e);
        }

    }

    public void updatedata(){

        SQLiteDatabase sq2= getWritableDatabase();
        String val[]=new String[]{"2"};
        ContentValues c3= new ContentValues();

        c3.put("email","newrocksss");

        sq2.update("student",c3,"id=?",val);


    }

    public void deletedata(){

        SQLiteDatabase sq3=getWritableDatabase();

        String val[]=new String[]{"3"};


        sq3.delete("student","id=?",val);


    }



}

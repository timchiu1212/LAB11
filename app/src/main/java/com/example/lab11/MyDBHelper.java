package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;




public class MyDBHelper extends SQLiteOpenHelper {

    private static final String name="mdatabase.db";
    private static final int version =1;

    MyDBHelper(Context context){
        super(context,name,null,version);
    }
    @Override
    public  void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE myTABLE(book text PRIMARY KEY, price integer NOT NULL)");
    }

    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        db.execSQL("DROP TABLE IF EXISTS myTable");
        onCreate(db);
    }

}
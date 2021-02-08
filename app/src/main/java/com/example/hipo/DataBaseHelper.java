package com.example.hipo;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "USER_RECORD.db";
    private static final String TABLE_NAME = "USER_DATA";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "FULLNAME";
    private static final String COL_3 = "USERNAME";
    private static final String COL_4 = "YEAR";
    private static final String COL_5 = "SECTION";
    private static final String COL_6 = "PASSWORD";


    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS "+TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT , FULLNAME TEXT, USERNAME TEXT, YEAR TEXT, SECTION TEXT, PASSWORD TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean registerUser(String fullname, String username, String year, String section, String password){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_2 , fullname);
        values.put(COL_3 , username);
        values.put(COL_4 , year);
        values.put(COL_5 , section);
        values.put(COL_6 , password);


        long result = db.insert(TABLE_NAME , null , values);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean checkUser(String username , String password){

        SQLiteDatabase db = this.getWritableDatabase();
        String [] columns = { COL_1 };
        String selection = COL_3 + "=?" + " and " + COL_6 + "=?";
        String [] selectionargs = { username , password};
        Cursor cursor = db.query(TABLE_NAME , columns , selection ,selectionargs , null , null , null);
        int count = cursor.getCount();
        db.close();
        cursor.close();
        if (count > 0)
            return true;
        else
            return false;

    }

    public Cursor alldata(){
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        


        Cursor cursor = sqLiteDatabase.rawQuery("select * from " + TABLE_NAME , null);
        return  cursor;
    }


}
//DataBaseHelper.txt
//        Displaying DataBaseHelper.txt.
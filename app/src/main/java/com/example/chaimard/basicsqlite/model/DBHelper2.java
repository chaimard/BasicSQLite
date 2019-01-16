package com.example.chaimard.basicsqlite.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper2 extends SQLiteOpenHelper {
    private static final String dbName = "Krirk.sqlite";
    private static final String tableName = "Customers";
    private static final int dbVersion =1;

    public DBHelper2(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + tableName + " (CustomerID INTEGER PRIMARY KEY,FullName TEXT(100),Gender TEXT(1),Address TEXT(200));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

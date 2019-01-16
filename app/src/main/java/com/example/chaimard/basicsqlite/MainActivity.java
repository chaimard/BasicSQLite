package com.example.chaimard.basicsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import com.example.chaimard.basicsqlite.model.DBHelper2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper2 db = new DBHelper2(this, null, null, 0);
        db.getWritableDatabase();
        Toast.makeText(MainActivity.this,"Create New DB success!!",Toast.LENGTH_LONG).show();

//        DBHelper2 db = new DBHelper2(this, null, null, 0);
//        db.getWritableDatabase();
//        Toast.makeText(MainActivity.this,"Create New DB success!!",Toast.LENGTH_LONG).show();

    }




}//main

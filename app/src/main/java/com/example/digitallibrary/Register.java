package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class Register extends AppCompatActivity {
    SQLiteOpenHelper openHelper;
    SQLiteDatabase db;
    Button log,reg;
    EditText edit1,edit2,edit3,edit4,edit5;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        openHelper=new DatabaseHelper(this);
        reg=(Button)findViewById(R.id.regiterbtn);
        edit1=(EditText)findViewById(R.id.edit1);
        edit2=(EditText)findViewById(R.id.edit2);
        edit3=(EditText)findViewById(R.id.edit3);
        edit4=(EditText)findViewById(R.id.edit4);
        edit5=(EditText)findViewById(R.id.edit5);
        log=(Button)findViewById(R.id.loginbtn);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db=openHelper.getWritableDatabase();
                String fname=edit1.getText().toString();
                String lname=edit2.getText().toString();
                String pass=edit3.getText().toString();
                String email=edit4.getText().toString();
                String phone=edit5.getText().toString();
                insertdata(fname,lname,pass,email,phone);
                Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_LONG).show();
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login =new Intent(Register.this,Login.class);
                startActivity(login);
            }
        });
    }
    public void insertdata(String fname, String lname,String pass,String email,String phone){
        ContentValues contentValues=new ContentValues();
        contentValues.put(DatabaseHelper.COL_2,fname);
        contentValues.put(DatabaseHelper.COL_3,lname);
        contentValues.put(DatabaseHelper.COL_4,pass);
        contentValues.put(DatabaseHelper.COL_5,email);
        contentValues.put(DatabaseHelper.COL_6,phone);
        long id = db.insert(DatabaseHelper.TABLE_NAME,null,contentValues);


    }
}

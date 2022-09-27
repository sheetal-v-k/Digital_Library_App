package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import android.os.Bundle;

public class Login extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Button loga,registera;
    EditText edita,editb;
    Cursor cursor;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        openHelper= new DatabaseHelper(this);
        db=openHelper.getReadableDatabase();
        loga=(Button)findViewById(R.id.loginbtna);
        registera=(Button)findViewById(R.id.registerbtn);
        edita=(EditText)findViewById(R.id.edita);
        editb=(EditText)findViewById(R.id.editb);
        loga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=edita.getText().toString();
                String pass=editb.getText().toString();
                cursor = db.rawQuery(" SELECT * FROM " + DatabaseHelper.TABLE_NAME + " WHERE " + DatabaseHelper.COL_5 + "=? AND " + DatabaseHelper.COL_4 + "=?" , new String[] {email,pass} );
                if(cursor!=null){
                    if(cursor.getCount()>0){
                        cursor.moveToNext();
                        Toast.makeText(getApplicationContext(),"Login Succssfully", Toast.LENGTH_LONG).show();
                        Intent book =new Intent(Login.this,Library.class);
                        startActivity(book);

                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Email or Password is Incorrect",Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
       registera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v ) {
                Intent register =new Intent(Login.this,Register.class);
                startActivity(register);
            }
        });


    }
}

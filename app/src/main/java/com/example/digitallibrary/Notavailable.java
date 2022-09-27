package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

import android.os.Bundle;

public class Notavailable extends AppCompatActivity {
    DatabaseHelper myDB;
    Button btnadd,btnview;
    EditText edittext;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notavailable);
        edittext = (EditText) findViewById(R.id.edittext);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnview = (Button) findViewById(R.id.btnview);

        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Notavailable.this,Viewlist.class);
                startActivity(intent);
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = edittext.getText().toString();

                if(edittext.length()!= 0)
                {
                    DatabaseHelper2 ob=new DatabaseHelper2(Notavailable.this);
                    ob.addData(newEntry);
                    Toast.makeText(Notavailable.this,"Successfully Added",Toast.LENGTH_LONG).show();


                } else
                {
                    Toast.makeText(Notavailable.this, "You must put something in the text field", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
/* public void AddData(String newEntry)
            {
               long  insertData= myDB.addData(edittext.toString());
                Toast.makeText(Review.this,"Successfully Entered Data",Toast.LENGTH_LONG).show();
               /* if(insertData==1)
                {
                    Toast.makeText(Review.this,"Successfully Entered Data",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Review.this,"Something went wrong:(.",Toast.LENGTH_LONG).show();
                }
*/

}

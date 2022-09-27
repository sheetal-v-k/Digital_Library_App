package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;


import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;


import android.os.Bundle;

public class Book1 extends AppCompatActivity {
    ListView pdfListview;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        pdfListview = (ListView) findViewById(R.id.myPDFList);
        String[] pdffiles = {"Computational Complexity: A Modern Approach", "Computability and Complexity"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdffiles) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view=super.getView(position, convertView, parent);
                TextView mytext=(TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };

        pdfListview.setAdapter(adapter);
        pdfListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String item=pdfListview.getItemAtPosition(i).toString();
                Intent s =new Intent(getApplicationContext(),pdfb1.class);
                s.putExtra("pdfFileName",item);
                startActivity(s);



            }
        });
    }
}

package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Bundle;

public class Viewlist extends AppCompatActivity {
    DatabaseHelper2 myDB1;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewlist);
        ListView listView = (ListView) findViewById(R.id.listview);
        myDB1 = new DatabaseHelper2(this);

        ArrayList<String> theList = new ArrayList<>();
        Cursor data = myDB1.getListContents();

        if (data.getCount() ==0)
        {
            Toast.makeText(Viewlist.this, "The Database is empty :(.",Toast.LENGTH_LONG).show();

        }
        else
        {
            while (data.moveToNext())
            {
                theList.add(data.getString(1));
                ListAdapter listAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,theList);
                listView.setAdapter(listAdapter);
            }
        }

    }
}

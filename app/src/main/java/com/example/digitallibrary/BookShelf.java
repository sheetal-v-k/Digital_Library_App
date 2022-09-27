package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.Toast;

public class BookShelf extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_shelf);
        Button btn11 = (Button) findViewById(R.id.btn11);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(BookShelf.this,pdf2.class);
                startActivity(d);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu( Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.review,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item ){
        switch(item.getItemId()){
            case R.id.option:
                Toast.makeText(this, "Review the Book", Toast.LENGTH_SHORT).show();
                Intent book=new Intent(BookShelf.this,Review.class);
                startActivity(book);
                return true;
            default: return super.onOptionsItemSelected(item);

        }
    }
}

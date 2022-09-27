package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

import android.os.Bundle;

public class pdfb3 extends AppCompatActivity {
    String bname;
    PDFView pdfView;
    MenuItem option1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfb3);
        PDFView pdfaib1=(PDFView) findViewById(R.id.pdfaib1);
        MyApplication.bookshelf=getIntent().getStringExtra("pdfFileName");
        if(MyApplication.bookshelf.equals("Algorithms")){
            pdfaib1.fromAsset("Algorithms-JeffE.pdf").load();
        }
        if(MyApplication.bookshelf.equals("Beginning Algorithms")){
            pdfaib1.fromAsset("Algorithms2.pdf").load();
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pdf,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item ){
        switch(item.getItemId()){
            case R.id.option1:
                Toast.makeText(this, "Added to BookShelf", Toast.LENGTH_SHORT).show();
                Intent book=new Intent(pdfb3.this,pdf2.class);
                startActivity(book);
                return true;
            case R.id.option2:
                Toast.makeText(this, "Review the Book", Toast.LENGTH_SHORT).show();
                Intent review=new Intent(pdfb3.this,Review.class);
                startActivity(review);
                return true;
            default: return super.onOptionsItemSelected(item);

        }
    }
}

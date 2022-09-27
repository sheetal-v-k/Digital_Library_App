package com.example.digitallibrary;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

import android.os.Bundle;

public class pdf2 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf2);
        PDFView pdfaib2=(PDFView) findViewById(R.id.pdfaib2);

        if(MyApplication.bookshelf.equals("Explorations in Artificial Intelligence and Machine Learning")){
            pdfaib2.fromAsset("ArtficialIntelligence.pdf").load();
        }
        if(MyApplication.bookshelf.equals("Artificial and Machine Learning")){
            pdfaib2.fromAsset("ArtficialIntelligenceandmachinelearning.pdf").load();
        }
        if(MyApplication.bookshelf.equals("Computational Complexity: A Modern Approach")){
            pdfaib2.fromAsset("Computational Complexity1.pdf").load();
        }
        if(MyApplication.bookshelf.equals("Computability and Complexity")){
            pdfaib2.fromAsset("Computational Complexity2.pdf").load();
        }
        if(MyApplication.bookshelf.equals("Algorithms")){
            pdfaib2.fromAsset("Algorithms-JeffE.pdf").load();
        }
        if(MyApplication.bookshelf.equals("Beginning Algorithms")){
            pdfaib2.fromAsset("Algorithms2.pdf").load();
        }
    }
}

package com.example.android_application;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {
    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_opener);
        myPDFViewer = findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");


        assert getItem != null;
        if(getItem.equals("Python Programming")){

            myPDFViewer.fromAsset("Python_Book.pdf").load();
        }
        if(getItem.equals("Hacking for Dummies")){

            myPDFViewer.fromAsset("Hacking_Book.pdf").load();
        }


    }
}

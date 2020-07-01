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
        if(getItem.equals("Professional Android")){

            myPDFViewer.fromAsset("Professional Android.pdf").load();
        }
        if(getItem.equals("Begining AngularJS")){

            myPDFViewer.fromAsset("Begining AngularJS.pdf").load();
        }

        if(getItem.equals("Hacking for Dummies")){

            myPDFViewer.fromAsset("Hacking_Book.pdf").load();
        }
        if(getItem.equals("Eat,Pray,Love")){

            myPDFViewer.fromAsset("Eat,Love,Pray.pdf").load();
        }
        if(getItem.equals("Python Programming")){

            myPDFViewer.fromAsset("Python_Book.pdf").load();
        }
        if(getItem.equals("Medical Microbiology")){

            myPDFViewer.fromAsset("Medical Microbiology.pdf").load();
        }
        if(getItem.equals("How learning works")){

            myPDFViewer.fromAsset("How Learning Works.pdf").load();
        }
        if(getItem.equals("Java Programming")){

            myPDFViewer.fromAsset("Java Programming.pdf").load();
        }
        if(getItem.equals("Mindset")){

            myPDFViewer.fromAsset("Mindset.pdf").load();
        }

        if(getItem.equals("Quran English")){

            myPDFViewer.fromAsset("Quran - English.pdf").load();
        }
        if(getItem.equals("Think Python")){

            myPDFViewer.fromAsset("Think Python.pdf").load();
        }
        if(getItem.equals("Yoga Anatomy")){

            myPDFViewer.fromAsset("Yoga Anatomy.pdf").load();
        }
        if(getItem.equals("Higher Engineering Mathematics")){

            myPDFViewer.fromAsset("Higher Engineering Mathematics.pdf").load();
        }
        if(getItem.equals("The Art of Public Speaking")){

            myPDFViewer.fromAsset("The Art of Public Speaking.pdf").load();
        }




    }
}

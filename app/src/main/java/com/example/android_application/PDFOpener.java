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
        if (getItem.equals("Professional Android")) {

            myPDFViewer.fromAsset("Professional Android.pdf").load();
        }
        if (getItem.equals("Begining AngularJS")) {

            myPDFViewer.fromAsset("Begining AngularJS.pdf").load();
        }
        if (getItem.equals("Probability and Statistics")) {

            myPDFViewer.fromAsset("Probability and Statistics.pdf").load();

        }
        if (getItem.equals("Space, Time and Einstein")) {

            myPDFViewer.fromAsset("Space, Time and Einstein.pdf").load();

        }
        if (getItem.equals("Hacking for Dummies")) {

            myPDFViewer.fromAsset("Hacking_Book.pdf").load();
        }
        if (getItem.equals("Cosmology")) {

            myPDFViewer.fromAsset("Cosmology.pdf").load();
        }
        if (getItem.equals("Data Analysis")) {

            myPDFViewer.fromAsset("Data Analysis.pdf").load();
        }
        if (getItem.equals("Python Programming")) {

            myPDFViewer.fromAsset("Python_Book.pdf").load();
        }
        if (getItem.equals("Internet - Encyclopedia")) {

            myPDFViewer.fromAsset("Internet - encyclopedia").load();
        }
        if (getItem.equals("Social Media Marketing")) {

            myPDFViewer.fromAsset("Social Media Marketing.pdf").load();
        }
        if (getItem.equals("Java Programming")) {

            myPDFViewer.fromAsset("Java Programming.pdf").load();
        }
        if (getItem.equals("Higher Engineering Mathematics")) {

            myPDFViewer.fromAsset("Higher Engineering Mathematics.pdf").load();

        }
        if (getItem.equals("Galactic Astronomy")) {

            myPDFViewer.fromAsset("Galactic Astronomy.pdf").load();
        }

        if (getItem.equals("Software Engineering")) {

            myPDFViewer.fromAsset("Software Engineering.pdf").load();
        }
        if (getItem.equals("Molecular Biology")) {

            myPDFViewer.fromAsset("Molecular Biology.pdf").load();

        }
        if (getItem.equals("Organic Chemistry")) {

            myPDFViewer.fromAsset("Organic Chemistry.pdf").load();

        }
        if (getItem.equals("Think Python")) {

            myPDFViewer.fromAsset("Think Python.pdf").load();
        }
        if (getItem.equals("Mathematical Physics")) {

            myPDFViewer.fromAsset("Mathematical Physics.pdf").load();

        }


    }
}

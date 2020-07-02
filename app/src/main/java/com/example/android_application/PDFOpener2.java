package com.example.android_application;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener2 extends AppCompatActivity {
    PDFView myPDFViewer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_opener2);
        myPDFViewer2 = findViewById(R.id.pdfViewer2);

        String getItem = getIntent().getStringExtra("pdfFileName");

        assert getItem != null;
        if (getItem.equals("Anxiety & Depression")) {

            myPDFViewer2.fromAsset("Anxiety & Depression.pdf").load();
        }
        if (getItem.equals("Cognitive Psychology")) {

            myPDFViewer2.fromAsset("Cognitive Psychology.pdf").load();
        }
        if (getItem.equals("Complete Yoga Poses")) {

            myPDFViewer2.fromAsset("Complete Yoga Poses.pdf").load();
        }

        if (getItem.equals("Food")) {

            myPDFViewer2.fromAsset("Food- -What the Heck Should I Eat.pdf").load();
        }
        if (getItem.equals("Mindset")) {

            myPDFViewer2.fromAsset("Mindset.pdf").load();
        }
        if (getItem.equals("Quran-English")) {

            myPDFViewer2.fromAsset("Quran - English.pdf").load();
        }
        if (getItem.equals("Yoga Anatomy")) {

            myPDFViewer2.fromAsset("Yoga Anatomy.pdf").load();
        }
        if (getItem.equals("Medicinal Herbs")) {

            myPDFViewer2.fromAsset("Handbook of Medicinal Herbs.pdf").load();
        }
        if (getItem.equals("The Art of Public Speaking")) {

            myPDFViewer2.fromAsset("The Art of Public Speaking.pdf").load();
        }
        if (getItem.equals("Fashion Design and Illustration")) {

            myPDFViewer2.fromAsset("Fashion Design and Illustration").load();
        }
        if (getItem.equals("Digital Colour in Graphic Design")) {

            myPDFViewer2.fromAsset("Digital Colour in Graphic Design.pdf").load();
        }
        if (getItem.equals("Basic Music Theory")) {

            myPDFViewer2.fromAsset("Basic Music Theory.pdf").load();
        }
        if (getItem.equals("Animation Writing and Development")) {

            myPDFViewer2.fromAsset("Animation Writing and Development.pdf").load();
        }

        if (getItem.equals("Mastering Photoshop")) {

            myPDFViewer2.fromAsset("Mastering Photoshop.pdf").load();
        }


    }
}

package com.example.android_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifestyleBooks extends AppCompatActivity {
    ListView pdfListView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics_books);
        pdfListView2 = (ListView) findViewById(R.id.myPDFList2);

        String[] pdfFiles2 = {"Anxiety & Depression", "Cognitive Psychology", "Complete Yoga Poses", "Food",
                "Mindset", "Quran-English", "Yoga Anatomy", "Medicinal Herbs", "The Art of Public Speaking", "Mindset",
                "Animation Writing and Development", "Basic Music Theory", "Fashion Design and Illustration",
                "Digital Colour in Graphic Design", "Mastering Photoshop"};


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles2) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView myText = findViewById(android.R.id.text1);
                return view;
            }
        };
        pdfListView2.setAdapter(adapter1);
        pdfListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = pdfListView2.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(), PDFOpener2.class);
                start.putExtra("pdfFileName", item);
                startActivity(start);
            }
        });
    }
}

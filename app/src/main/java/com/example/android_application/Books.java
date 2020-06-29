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

public class Books extends AppCompatActivity {
    ListView pdfListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        pdfListView = (ListView) findViewById(R.id.myPDFList);

        String[] pdfFiles = {"Hacking for Dummies", "Professional Android", "Python Programming","Eat,Pray,Love","How learning works","Java Programming",
        "Mindset","Quran-Englisht","Think Python","Yoga Anatomy"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, pdfFiles) {

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView myText = (TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };


        pdfListView.setAdapter(adapter);
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item=pdfListView.getItemAtPosition(position).toString();
                Intent start=new Intent(getApplicationContext(),PDFOpener.class);
                start.putExtra("pdfFileName", item);
                startActivity(start);
            }
        });




            }



                //String item = pdfListView.getItemAtPosition(i).toString();

               // Intent start = new Intent(getApplicationContext(), PDFopener.class);
                //start.putExtra("pdfFileName", item);
                //startActivity(start);


}


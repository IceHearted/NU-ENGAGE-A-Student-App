package com.example.nunew2.MainPage.Documents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nunew2.R;

public class Documents extends AppCompatActivity {

    CardView doc1, doc2, doc3, doc4, doc5, doc6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documents);

        doc1 = findViewById(R.id.doc1);
        doc2 = findViewById(R.id.doc2);
        doc3 = findViewById(R.id.doc3);
        doc4 = findViewById(R.id.doc4);
        doc5 = findViewById(R.id.doc5);
        doc6 = findViewById(R.id.doc6);

        doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Documents.this, Doc1.class);
                startActivity(intent);
            }
        });
        doc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Documents.this, animation.class);
                startActivity(intent);
            }
        });
        doc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Documents.this, css1.class);
                startActivity(intent);
            }
        });
        doc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Documents.this, multim.class);
                startActivity(intent);
            }
        });
        doc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Documents.this, timingfun.class);
                startActivity(intent);
            }
        });
        doc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(Documents.this, nus.class);
                startActivity(intent);
            }
        });
    }
}
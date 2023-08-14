package com.example.nunew2.MainPage.Exams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.nunew2.MainPage.Acedemics.Academics;
import com.example.nunew2.MainPage.Documents.Documents;
import com.example.nunew2.MainPage.Exams.Exams;
import com.example.nunew2.MainPage.More.More;
import com.example.nunew2.R;

public class Exams extends AppCompatActivity {

    CardView results, digAssig, Exmtt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);

        results = findViewById(R.id.results);
        digAssig = findViewById(R.id.digAssig);
        Exmtt = findViewById(R.id.examtimet);

        results.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exams.this, Results.class);
                startActivity(intent);
            }
        });

        digAssig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Exams.this, "No Assignment Available Now", Toast.LENGTH_SHORT).show();
            }
        });

        Exmtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exams.this, examtt.class);
                startActivity(intent);
            }
        });
    }
}
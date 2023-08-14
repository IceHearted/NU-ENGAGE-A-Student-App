package com.example.nunew2.MainPage;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.nunew2.MainPage.Acedemics.Academics;
import com.example.nunew2.MainPage.Documents.Documents;
import com.example.nunew2.MainPage.Exams.Exams;
import com.example.nunew2.MainPage.More.More;
import com.example.nunew2.R;
import com.example.nunew2.MainPage.Schedule.Schedules;
import com.example.nunew2.MainPage.Updates.Updates;

public class MainActivity extends AppCompatActivity {

    CardView schedulesCard, academicsCard, examsCard, moreCard, updateCard, docCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        schedulesCard = findViewById(R.id.schedulesCard);
        academicsCard = findViewById(R.id.academicsCard);
        examsCard = findViewById(R.id.examsCard);
        docCard = findViewById(R.id.docCard);
        updateCard = findViewById(R.id.updateCard);
        moreCard = findViewById(R.id.moreCard);

        schedulesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Schedules.class);
                startActivity(intent);
            }
        });

        academicsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Academics.class);
                startActivity(intent);

            }
        });

        examsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exams.class);
                startActivity(intent);

            }
        });

        docCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Documents.class);
                startActivity(intent);

            }
        });

        updateCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Updates.class);
                startActivity(intent);

            }
        });

        moreCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, More.class);
                startActivity(intent);

            }
        });

    }
}
package com.example.nunew2.MainPage.Acedemics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.nunew2.MainPage.Documents.Doc1;
import com.example.nunew2.MainPage.Documents.Documents;
import com.example.nunew2.R;

public class Academics extends AppCompatActivity {

    CardView attendanceCard, facdetailsCars, stuMatCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        attendanceCard = findViewById(R.id.myAttendance);
        facdetailsCars = findViewById(R.id.facDetails);
        stuMatCard = findViewById(R.id.StuMat);

        attendanceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Academics.this, "Your Attendance Not Updated", Toast.LENGTH_SHORT).show();
            }
        });

        facdetailsCars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academics.this, Faculty_Details.class);
                startActivity(intent);
            }
        });
        stuMatCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academics.this, Documents.class);
                startActivity(intent);
            }
        });

    }
}
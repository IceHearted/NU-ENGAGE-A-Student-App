package com.example.nunew2.MainPage.Schedule;

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
import com.example.nunew2.MainPage.Schedule.Schedules;
import com.example.nunew2.MainPage.Updates.Updates;

public class Schedules extends AppCompatActivity {

    CardView y3tt, y2tt, aCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules);

        y3tt = findViewById(R.id.y3tt);
        y2tt = findViewById(R.id.y2tt);
        aCal = findViewById(R.id.acal);

        y3tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Schedules.this, TimeTable.class);
                startActivity(intent);

            }
        });

        y2tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(Schedules.this, "2nd Year TimeTable Not Updated", Toast.LENGTH_SHORT).show();

            }
        });
        aCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Schedules.this, "Academic Calender 2023 Not Updated", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
package com.example.nunew2.MainPage.More;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.nunew2.MainPage.Schedule.Schedules;
import com.example.nunew2.R;

public class More extends AppCompatActivity {

    CardView sports, extracurr, payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        sports = findViewById(R.id.sports);
        extracurr = findViewById(R.id.ExtraCurr);
        payment = findViewById(R.id.Payments);

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(More.this, "Sports Still Not Updated", Toast.LENGTH_SHORT).show();
            }
        });
        extracurr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(More.this, "Extra corporate activities still not updated ", Toast.LENGTH_SHORT).show();
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(More.this, Payment.class);
                startActivity(intent);
            }
        });
    }
}
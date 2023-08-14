package com.example.nunew2.MainPage.Schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.nunew2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class TimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        PDFView ttpdf =findViewById(R.id.ttView);

        ttpdf.fromAsset("3_BSC_TT.pdf").load();

    }
}
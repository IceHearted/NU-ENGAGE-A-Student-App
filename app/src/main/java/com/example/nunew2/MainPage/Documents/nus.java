package com.example.nunew2.MainPage.Documents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nunew2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class nus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nus);

        PDFView ttpdf =findViewById(R.id.nusView);

        ttpdf.fromAsset("synopsis.pdf").load();
    }
}
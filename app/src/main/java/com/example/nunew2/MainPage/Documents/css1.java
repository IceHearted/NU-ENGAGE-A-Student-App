package com.example.nunew2.MainPage.Documents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.nunew2.R;
import com.github.barteksc.pdfviewer.PDFView;

public class css1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css1);

        PDFView ttpdf =findViewById(R.id.cssView);

        ttpdf.fromAsset("css.pdf").load();
    }
}
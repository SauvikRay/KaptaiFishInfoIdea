package com.example.biddutkarmakar.kaptaifishinfo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RangamatiList6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangamati_list6);

        String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);

        TextView txtGhost1 = (TextView) findViewById(R.id.text1);
        txtGhost1.setTypeface(tf1);

        TextView txtGhost2 = (TextView) findViewById(R.id.text2);
        txtGhost2.setTypeface(tf1);


    }
}

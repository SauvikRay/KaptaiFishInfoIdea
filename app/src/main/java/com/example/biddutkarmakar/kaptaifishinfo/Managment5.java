package com.example.biddutkarmakar.kaptaifishinfo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Managment5 extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    TextView tx1,tx2,tx3,tx4,tx5,tx6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_managment5);

        String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);

        btn = (Button) findViewById(R.id.button);

        tx1=(TextView)findViewById(R.id.text1);
        tx2=(TextView)findViewById(R.id.text2);
        tx3=(TextView)findViewById(R.id.text3);
        tx4=(TextView)findViewById(R.id.text4);
        tx5=(TextView)findViewById(R.id.text5);
        tx6=(TextView)findViewById(R.id.text6);


        tx1.setTypeface(tf1);
        tx2.setTypeface(tf1);
        tx3.setTypeface(tf1);
        tx4.setTypeface(tf1);
        tx5.setTypeface(tf1);
        tx6.setTypeface(tf1);
        btn.setTypeface(tf1);

        btn.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id;
        id = v.getId();
        switch (id) {
            case R.id.button:
                Intent intent1 = new Intent(this, ManagmentBarGraph.class);
                startActivity(intent1);
                break;

        }

    }

}

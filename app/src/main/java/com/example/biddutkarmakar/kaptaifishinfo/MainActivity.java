package com.example.biddutkarmakar.kaptaifishinfo;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn4=(Button)findViewById(R.id.button4);
        btn5=(Button)findViewById(R.id.button5);
        btn6=(Button)findViewById(R.id.button6);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    public void onClick(View v)
    {
        int id;
        id=v.getId();
        switch (id)
        {
            case R.id.button:
                Intent intent1=new Intent(this,FishFirst.class);
                startActivity(intent1);
                break;

            case R.id.button2:
                Intent intent2=new Intent(this,Bussiness.class);
                startActivity(intent2);
                break;

            case R.id.button3:
                Intent intent3=new Intent(this,Managment.class);
                startActivity(intent3);
                break;

            case R.id.button4:
                Intent intent4=new Intent(this,Rangamati.class);
                startActivity(intent4);
                break;

            case R.id.button5:
                Intent intent5=new Intent(this,Disease.class);
                startActivity(intent5);
                break;

            case R.id.button6:
                Intent intent6=new Intent(this,FishSixth.class);
                startActivity(intent6);
                break;


        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

    }
}

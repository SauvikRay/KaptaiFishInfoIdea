package com.example.biddutkarmakar.kaptaifishinfo;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Bussiness extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_bussiness);

       // ListView listView = (ListView) findViewById(R.id.listview1);
        //listView.setTypeface(tf1);

        ListView listView = (ListView)findViewById(R.id.listview1);

        String[] bussiness={" হ্রদের বাণিজ্যিক গুরুত্বসম্পন্নমৎস্য প্রজাতি "," হ্রদের বর্তমান বাণিজ্যিক গুরুত্বসম্পন্ন মৎস্য প্রজাতিসমূহের তালিকা  "," হ্রদের মৎস্য জীব-বৈচিত্র্য পরিবর্তনের ক্রমধারা"," হ্রদের মৎস্য জীব-বৈচিত্র্য পরিবর্তনের সার-সংক্ষেপ "};
       // boolean[] listImages={true, true, true, true};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,bussiness);


       // setListAdapter(new ImageAdapter(this, android.R.layout.simple_list_item_1, R.id.text1, R.id.image1, bussiness, listImages ));


        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        Intent newActivity = new Intent(Bussiness.this, BussinessList1.class);
                        startActivity(newActivity);
                        break;

                    case 1:
                        Intent newActivity2 = new Intent(Bussiness.this, BussinessList2.class);
                        startActivity(newActivity2);
                        break;

                    case 2:
                        Intent newActivity3 = new Intent(Bussiness.this, BussinessList3.class);
                        startActivity(newActivity3);
                        break;

                    case 3:
                        Intent newActivity4 = new Intent(Bussiness.this, BussinessList4.class);
                        startActivity(newActivity4);
                        break;
                }

            }

            @SuppressWarnings("unused")
            public void onClick(View v) {
            }

            ;
        });


    }
}

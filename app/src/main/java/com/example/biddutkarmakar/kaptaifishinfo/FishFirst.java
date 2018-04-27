package com.example.biddutkarmakar.kaptaifishinfo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FishFirst extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_first);

        ListView listView = (ListView)findViewById(R.id.listview1);
        String[] managment={" কাপ্তাই লেকের সাধারণ তথ্যাদি  "," মৎস্য প্রজাতি সমুহের গ্রুপভিত্তিক পরিবর্তনের ক্রমধারা "," মৎস্য জীব-বৈচিত্র্য ও প্রজাতি বিন্যাস "};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, managment);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(FishFirst.this, FishFirstList1.class);
                        startActivity(newActivity);
                        break;

                    case 1:
                        Intent newActivity3 = new Intent(FishFirst.this, FishFirstListtt3.class);
                        startActivity(newActivity3);
                        break;


                    case 2:
                        Intent newActivity4 = new Intent(FishFirst.this, FishFirstList2.class);
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

package com.example.biddutkarmakar.kaptaifishinfo;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Disease extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_disease);
        ListView listView = (ListView)findViewById(R.id.listview1);
        String[] rangamati4={" ক্ষত রোগ বা আলসার ডিজিজ "," লেজ ও পাখনা পঁচা রোগে "," ফুলকা পঁচা রোগ "," পরজীবিজনিত  "," মাছের উঁকুন ও আরগুলোসিস ",
                " পাঙ্গাসের লালচে দাগ রোগ "," কৈ মাছের ক্ষত রোগ "," শিং মাছের ব্যাকটেরিয়া জনিত রোগ "," তেলাপিয়ার স্টেপটোকক্কোসিস রোগ ",
                " পুষ্ঠিহীনতা জনিত রোগ "," জলাশয়ে অক্সিজেন স্বল্পতা, গ্যাসজনিত বিষক্রিয়া "," ছত্রাক জনিত রোগ "

        };
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rangamati4);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(Disease.this, DiseaseList1.class);
                        startActivity(newActivity);
                        break;

                    case 1:
                        Intent newActivity1 = new Intent(Disease.this, DiseaseList2.class);
                        startActivity(newActivity1);
                        break;

                    case 2:
                        Intent newActivity2 = new Intent(Disease.this, DiseaseList3.class);
                        startActivity(newActivity2);
                        break;

                    case 3:
                        Intent newActivity3 = new Intent(Disease.this, DiseaseList4.class);
                        startActivity(newActivity3);
                        break;

                    case 4:
                        Intent newActivity4 = new Intent(Disease.this, DiseaseList5.class);
                        startActivity(newActivity4);
                        break;

                    case 5:
                        Intent newActivity5 = new Intent(Disease.this, DiseaseList6.class);
                        startActivity(newActivity5);
                        break;

                    case 6:
                        Intent newActivity6 = new Intent(Disease.this, DiseaseList7.class);
                        startActivity(newActivity6);
                        break;

                    case 7:
                        Intent newActivity7= new Intent(Disease.this, DiseaseList8.class);
                        startActivity(newActivity7);
                        break;
                    case 8:
                        Intent newActivity8 = new Intent(Disease.this, DiseaseList9.class);
                        startActivity(newActivity8);
                        break;
                    case 9:
                        Intent newActivity9 = new Intent(Disease.this, DiseaseList10.class);
                        startActivity(newActivity9);
                        break;


                    case 10:
                        Intent newActivity10 = new Intent(Disease.this, DiseaseList11.class);
                        startActivity(newActivity10);
                        break;

                    case 11:
                        Intent newActivity12 = new Intent(Disease.this, DiseaseList12.class);
                        startActivity(newActivity12);
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

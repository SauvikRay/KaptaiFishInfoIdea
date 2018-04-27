package com.example.biddutkarmakar.kaptaifishinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Managment1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_managment2);
        ListView listView = (ListView)findViewById(R.id.listview1);
        String[] managment2={" মৎস্য প্রজননক্ষেত্র সংরক্ষণ ও ব্যবস্থাপনা  "," অভয়াশ্রম ব্যবস্থাপনার কার্যকারিতা "," পাহাড়ী ঘোনায় নার্সারী স্থাপন ও ব্যবস্থাপনা ",
                " নির্ধারিত আকারের বড় পোনা মজুদ ও ব্যবস্থাপনা "," ক্ষতিকর মৎস্য  শিকার  পদ্ধতি প্রতিরোধ ব্যবস্থাপনা "," বিকল্পমৎস্য চাষ প্রদ্ধতি উদ্ভাবন সর্ম্পকীয় গবেষণা ও এর ব্যবস্থাপনা",
                " গবেষণা কার্যক্রম  জোরদারকরণ    "};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, managment2);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(Managment1.this, Managment1List1.class);
                        startActivity(newActivity);
                        break;

                    case 1:
                        Intent newActivity2 = new Intent(Managment1.this, Managment1List2.class);
                        startActivity(newActivity2);
                        break;


                    case 2:
                        Intent newActivity3 = new Intent(Managment1.this, Managment1List3.class);
                        startActivity(newActivity3);
                        break;

                    case 3:
                        Intent newActivity4 = new Intent(Managment1.this, Managment1List4.class);
                        startActivity(newActivity4);
                        break;

                    case 4:
                        Intent newActivity5 = new Intent(Managment1.this, Managment1List5.class);
                        startActivity(newActivity5);
                        break;

                    case 5:
                        Intent newActivity6 = new Intent(Managment1.this, Managment1List6.class);
                        startActivity(newActivity6);
                        break;

                    case 6:
                        Intent newActivity7 = new Intent(Managment1.this, Managment1List7.class);
                        startActivity(newActivity7);
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


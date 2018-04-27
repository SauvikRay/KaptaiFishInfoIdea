package com.example.biddutkarmakar.kaptaifishinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RangamatiList2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangamati2);

        ListView listView = (ListView)findViewById(R.id.listview1);
        String[] rangamati={" উপজেলা নাম, আয়তন ও পুকুরের সংখ্যার টেবিল  "," উন্নয়নকৃত ক্রিক এর টেবিল "," জলাশয়ের সাধারণ  তথ্যাদি "};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rangamati);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Intent newActivity1 = new Intent(RangamatiList2.this, Rangamati2List1.class);
                        startActivity(newActivity1);
                        break;

                    case 1:
                        Intent newActivity2 = new Intent(RangamatiList2.this, Rangamati2List2.class);
                        startActivity(newActivity2);
                        break;

                    case 2:
                        Intent newActivity3 = new Intent(RangamatiList2.this, Rangamati2List3.class);
                        startActivity(newActivity3);
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

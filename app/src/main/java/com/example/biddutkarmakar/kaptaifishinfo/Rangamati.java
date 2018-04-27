package com.example.biddutkarmakar.kaptaifishinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Rangamati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_rangamati);
        ListView listView = (ListView)findViewById(R.id.listview1);
        String[] rangamati={" সাধারন তথ্যাদি "," জলাশয় সংক্রান্ত তথ্যাদি "," হ্যাচারী/নার্সারী সংক্রান্ত তথ্যাদি "," হ্রদের মৎস্য উৎপাদন বৃদ্ধির জন্য গৃহীত সুপারিশস  মালা ",
                " বিএফআরআই কতৃক সম্পাদিত গবেষণাসমূহ "," উদ্ভাবক পরিচিতি  "};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rangamati);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Intent newActivity1 = new Intent(Rangamati.this, RangamatiList1.class);
                        startActivity(newActivity1);
                        break;

                    case 1:
                        Intent newActivity2 = new Intent(Rangamati.this, RangamatiList2.class);
                        startActivity(newActivity2);
                        break;

                    case 2:
                        Intent newActivity3 = new Intent(Rangamati.this, RangamatiList3.class);
                        startActivity(newActivity3);
                        break;

                    case 3:
                        Intent newActivity = new Intent(Rangamati.this, RangamatiList4.class);
                        startActivity(newActivity);
                        break;

                    case 4:
                        Intent newActivity5 = new Intent(Rangamati.this, RangamatiList5.class);
                        startActivity(newActivity5);
                        break;

                    case 5:
                        Intent newActivity6 = new Intent(Rangamati.this, RangamatiList6.class);
                        startActivity(newActivity6);
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

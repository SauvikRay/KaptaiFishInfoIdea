package com.example.biddutkarmakar.kaptaifishinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RangamatiList3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangamati3);


        ListView listView = (ListView)findViewById(R.id.listview1);
        String[] rangamati={" রাঙ্গামাটি জেলার জলাশয়ের তুলনামূলক উৎপাদন তথ্য "," হ্যাচারী/নার্সারী সংখ্যার সাধারণ  তথ্যাদি "};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, rangamati);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Intent newActivity1 = new Intent(RangamatiList3.this, Rangamati3List1.class);
                        startActivity(newActivity1);
                        break;

                    case 1:
                        Intent newActivity2 = new Intent(RangamatiList3.this, Rangamati3List2.class);
                        startActivity(newActivity2);
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

package com.example.biddutkarmakar.kaptaifishinfo;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Managment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_managment);

        ListView listView = (ListView)findViewById(R.id.listview1);
        String[] managment={" কাপ্তাই লেকে মৎস্য জীব-বৈচিত্র্য সংরক্ষণে সহনশীল ব্যবস্থাপনা কৌশল  ",
                " লাভজনক মাছ চাষে নিয়মিত করণীয় "," মাছ চাষে জৈব নিরাপত্ত ও রোগ প্রতিরোধ কৌশল "," পরজীবি নিয়ন্ত্রনে রাসায়নিক দ্রব্যের উপযোগীতা ও প্রয়োগমাত্রা ",
               " হ্রদের মাছের উৎপাদন বৃদ্ধির জন্য সুপারিশসমূহ ", " মংস্যচাষীয় কাজের বর্ষপঞ্জী ", " স্থানীয় পরিমাপকসমূহ "};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, managment);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent newActivity = new Intent(Managment.this, Managment1.class);
                        startActivity(newActivity);
                        break;

                    case 1:
                        Intent newActivity2 = new Intent(Managment.this, Managment2.class);
                        startActivity(newActivity2);
                        break;


                    case 2:
                        Intent newActivity3 = new Intent(Managment.this, Managment3.class);
                        startActivity(newActivity3);
                        break;

                    case 3:
                        Intent newActivity4 = new Intent(Managment.this, Managment4.class);
                        startActivity(newActivity4);
                        break;


                    case 4:
                        Intent newActivity5 = new Intent(Managment.this, Managment5.class);
                        startActivity(newActivity5);
                        break;


                    case 5:
                        Intent newActivity6 = new Intent(Managment.this, Managment6.class);
                        startActivity(newActivity6);
                        break;


                    case 6:
                        Intent newActivity7 = new Intent(Managment.this, Managment7.class);
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

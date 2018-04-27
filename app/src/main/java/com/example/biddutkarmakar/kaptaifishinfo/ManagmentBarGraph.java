package com.example.biddutkarmakar.kaptaifishinfo;


import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.mikephil.charting.charts.BarChart;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class ManagmentBarGraph
        extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_managment_bar_graph);

        BarChart barChart = (BarChart) findViewById(R.id.chart);


        TextView txt = (TextView) findViewById(R.id.text);
        TextView txt1 = (TextView) findViewById(R.id.text1);

        String fontPath1 = "fonts/AdorshoLipi_20-07-2007.ttf";
        Typeface tf1 = Typeface.createFromAsset(getAssets(), fontPath1);
        txt.setTypeface(tf1);
        txt1.setTypeface(tf1);



        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4566f, 0));
        entries.add(new BarEntry(5421f, 1));
        entries.add(new BarEntry(5890f, 2));
        entries.add(new BarEntry(7687f, 3));
        entries.add(new BarEntry(5389f, 4));
        entries.add(new BarEntry(7633f, 5));
        entries.add(new BarEntry(5490f, 6));
        entries.add(new BarEntry(7115f, 7));
        entries.add(new BarEntry(8974f, 8));
        entries.add(new BarEntry(8421f, 9));
        entries.add(new BarEntry(8813f, 10));
        entries.add(new BarEntry(7725f, 11));
        entries.add(new BarEntry(8560f, 12));
        entries.add(new BarEntry(9364f, 13));

        BarDataSet dataset = new BarDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("2-3");
        labels.add("3-4");
        labels.add("4-5");
        labels.add("5-6");
        labels.add("6-7");
        labels.add("7-8");
        labels.add("8-9");
        labels.add("9-10");
        labels.add("10-11");
        labels.add("11-12");
        labels.add("12-13");
        labels.add("13-14");
        labels.add("14-15");
        labels.add("15-16");



        BarData data = new BarData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        barChart.setData(data);
        barChart.animateY(5000);

    }
}

package com.example.adapterandlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvw = (ListView) findViewById(R.id.lv);

        ArrayList<String> my = new ArrayList<>();

        my.add("Class 1 ");
        my.add("Class 2 ");
        my.add("Class 3 ");
        my.add("Class 4 ");
        my.add("Class 5 ");
        my.add("Class 6 ");
        my.add("Class 7 ");
        my.add("Class 8 ");
        my.add("Class 9 ");
        my.add("Class 10");


        ArrayAdapter ad = new ArrayAdapter( this,android.R.layout.simple_list_item_1 , my);

        lvw.setAdapter(ad);

        lvw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Clicked on " + my(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
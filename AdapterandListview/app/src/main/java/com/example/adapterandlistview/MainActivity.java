package com.example.adapterandlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvw = (ListView) findViewById(R.id.lv);

        List<String> mylist = new ArrayList<>();

        mylist.add("Class 1 ");
        mylist.add("Class 2 ");
        mylist.add("Class 3 ");
        mylist.add("Class 4 ");
        mylist.add("Class 5 ");
        mylist.add("Class 6 ");
        mylist.add("Class 7 ");
        mylist.add("Class 8 ");
        mylist.add("Class 9 ");
        mylist.add("Class 10");


        ArrayAdapter ad = new ArrayAdapter( this,android.R.layout.simple_list_item_1 , mylist);

        lvw.setAdapter(ad);
    }
}
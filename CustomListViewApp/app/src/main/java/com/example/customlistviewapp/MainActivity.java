package com.example.customlistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.list);

        //create data
        ArrayList<person> arrlist = new ArrayList<>();
        arrlist.add(new person (R.drawable.img,"First Image","idk what it is"));
        arrlist.add(new person (R.drawable.img_1,"second Image","idk what it is"));
        arrlist.add(new person (R.drawable.img_2,"third Image","idk what it is"));
        arrlist.add(new person (R.drawable.img_3,"Fourth Image","idk what it is"));


    }
}
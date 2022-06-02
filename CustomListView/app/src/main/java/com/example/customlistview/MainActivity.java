package com.example.customlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);

        List<ListItem> list = new ArrayList<>();
        list.add(new ListItem(R.drawable.img_1, "Image 1"));
        list.add(new ListItem(R.drawable.img_2, "Image 2"));
        list.add(new ListItem(R.drawable.img_3, "Image 3"));

        ListViewAdapter listViewAdapter = new ListViewAdapter(this, list);
        lv.setAdapter(listViewAdapter);
    }
}
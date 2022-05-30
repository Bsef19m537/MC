package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mylistview = findViewById(R.id.ab);
        final ArrayList<String> samaan = new ArrayList<>();
        samaan.add("dahi");
        samaan.add("mango");
        samaan.add("zaitoon");
        samaan.add("chukandar");
        samaan.add("baking powder");

        ArrayAdapter<String> arradapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,samaan );
        mylistview.setAdapter(arradapt);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String text = "Item" + i + "  " + view.toString();
                Toast.makeText(MainActivity.this,text, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
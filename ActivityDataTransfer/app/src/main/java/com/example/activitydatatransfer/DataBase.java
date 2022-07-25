package com.example.activitydatatransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataBase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_base);

        TextView t1 = (TextView) findViewById(R.id.textView5);
        TextView t2 = (TextView) findViewById(R.id.textView5);
        TextView t3 = (TextView) findViewById(R.id.textView5);

        Button btn = (Button) findViewById(R.id.button2);

        Bundle bn = getIntent().getExtras();
        String name = bn.getString("keyname");
        String email = bn.getString("keyemail");
        String id = bn.getString("keyid");

        t1.setText(String.valueOf(name));
        t2.setText(String.valueOf(email));
        t3.setText(String.valueOf(id));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DataBase.this , MainActivity.class);
                startActivity(it);
            }
        });
    }
}
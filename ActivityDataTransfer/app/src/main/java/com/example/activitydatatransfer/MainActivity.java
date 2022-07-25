package com.example.activitydatatransfer;

import static com.example.activitydatatransfer.R.id.editTextTextPersonName;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText t1 =(EditText) findViewById(R.id.editTextTextPersonName);
        EditText t2 =(EditText) findViewById(R.id.editTextTextPersonName2);
        EditText t3 =(EditText) findViewById(R.id.editTextTextPersonName3);

        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = t1.getText().toString();
                String email = t2.getText().toString();
                String id = t3.getText().toString();

                Intent it = new Intent(MainActivity.this , DataBase.class);
                it.putExtra("keyname" , name );
                it.putExtra("keyemail" , email );
                it.putExtra("keyid" , id );

                startActivity(it);

            }
        });
    }
}
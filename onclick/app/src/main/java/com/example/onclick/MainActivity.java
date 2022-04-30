package com.example.onclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText)findViewById(R.id.editTextTextPersonName2);
    }


    public void Onclick(View view) {
        Toast.makeText(MainActivity.this, "Form submitted successfully", Toast.LENGTH_LONG).show();

    }
}
package com.example.kidsabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_lesson,btn_quiz,btn_repo;
        btn_lesson=findViewById(R.id.button2);
        btn_quiz=findViewById(R.id.button3);
        btn_repo=findViewById(R.id.button);


        btn_lesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,interLesson.class);
                startActivity(intent);
            }
        });
        btn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,interQuiz.class);
                startActivity(intent);
            }
        });


        btn_repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/BSEF19M537/MC"));
                startActivity(browserIntent);
            }
        });

    }
}
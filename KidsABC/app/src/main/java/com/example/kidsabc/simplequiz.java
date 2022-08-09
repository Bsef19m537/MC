package com.example.kidsabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class simplequiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplequiz);

        Random r=new Random();
        String[] arr={"a" , "b", "c", "d", "e", "f", "g", "h", "i", "j","k","l","m","n","o","p","q","r","s","t","u", "v", "w", "x" , "y", "z"};
        String name1=arr[r.nextInt(arr.length)];
        String name2,name3,name4,name5;
        do {
            name2 = arr[r.nextInt(arr.length)];
        }
        while (name1.equals(name2));
        do {
            name3=arr[r.nextInt(arr.length)];
        }
        while (name3.equals(name1)||name3.equals(name2));
        do {
            name4=arr[r.nextInt(arr.length)];
        }
        while (name4.equals(name2)||name4.equals(name1)||name4.equals(name3));
        do {
            name5=arr[r.nextInt(arr.length)];
        }
        while (name5.equals(name1)||name5.equals(name2)||name5.equals(name3)||name5.equals(name4));

        char opt1=setRadioValue(name1,"rb1");
        char opt2=setRadioValue(name2,"rb2");
        char opt3=setRadioValue(name3,"rb3");
        char opt4=setRadioValue(name4,"rb4");
        char opt5=setRadioValue(name5,"rb5");
        //System.out.println(opt5);
        char[] answer={opt1,opt2,opt3,opt4,opt5};

        View v = findViewById(R.id.view1);
        int resId1;
        resId1=getResources().getIdentifier(name1 , "drawable", simplequiz.this.getPackageName());
        v.setBackgroundResource(resId1);
        (findViewById(R.id.view2)).setBackgroundResource(getResources().getIdentifier(name2 , "drawable", Quiz.this.getPackageName()));
        (findViewById(R.id.view5)).setBackgroundResource(getResources().getIdentifier(name3 , "drawable", Quiz.this.getPackageName()));
        (findViewById(R.id.view6)).setBackgroundResource(getResources().getIdentifier(name4 , "drawable", Quiz.this.getPackageName()));
        (findViewById(R.id.view7)).setBackgroundResource(getResources().getIdentifier(name5 , "drawable", Quiz.this.getPackageName()));


        RadioGroup rgq1=findViewById(R.id.rg1);
        RadioGroup rgq2=findViewById(R.id.rg2);
        RadioGroup rgq3=findViewById(R.id.rg3);
        RadioGroup rgq4=findViewById(R.id.rg4);
        RadioGroup rgq5=findViewById(R.id.rg5);

        RadioGroup[] out={rgq1,rgq2,rgq3,rgq4,rgq5};

        Button btn=findViewById(R.id.submit);

    }
}
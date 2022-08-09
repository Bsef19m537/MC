package com.example.kidsabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class AlphabetsImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_image);

        Intent intent = getIntent();
        String idd = intent.getStringExtra("alphabets");
        ImageView imagev = findViewById(R.id.imageView);

        if (idd.equals("a"))
        {
            imagev.setImageResource(R.drawable.A);
        }
        if(idd.equals("b"))
        {
            imagev.setImageResource(R.drawable.B);
        }
        if (idd.equals("c"))
        {
            imagev.setImageResource(R.drawable.C);
        }
        if (idd.equals("d"))
        {
            imagev.setImageResource(R.drawable.D);
        }
        if (idd.equals("e"))
        {
            imagev.setImageResource(R.drawable.E);
        }
        if (idd.equals("f"))
        {
            imagev.setImageResource(R.drawable.F);
        }
        if (idd.equals("g"))
        {
            imagev.setImageResource(R.drawable.G);
        }
        if (idd.equals("h"))
        {
            imagev.setImageResource(R.drawable.H);
        }
        if (idd.equals("i"))
        {
            imagev.setImageResource(R.drawable.I);
        }
        if (idd.equals("j"))
        {
            imagev.setImageResource(R.drawable.J);
        }
        if (idd.equals("k"))
        {
            imagev.setImageResource(R.drawable.K);
        }
        if (idd.equals("l"))
        {
            imagev.setImageResource(R.drawable.L);
        }
        if (idd.equals("m"))
        {
            imagev.setImageResource(R.drawable.M);
        }
        if (idd.equals("n"))
        {
            imagev.setImageResource(R.drawable.N);
        }
        if (idd.equals("o"))
        {
            imagev.setImageResource(R.drawable.O);
        }
        if (idd.equals("p"))
        {
            imagev.setImageResource(R.drawable.P);
        }
        if (idd.equals("q"))
        {
            imagev.setImageResource(R.drawable.Q);
        }
        if (idd.equals("r"))
        {
            imagev.setImageResource(R.drawable.R);
        }
        if (idd.equals("s"))
        {
            imagev.setImageResource(R.drawable.S);
        }
        if (idd.equals("t"))
        {
            imagev.setImageResource(R.drawable.T);
        }
        if (idd.equals("u"))
        {
            imagev.setImageResource(R.drawable.U);
        }
        if (idd.equals("v"))
        {
            imagev.setImageResource(R.drawable.V);
        }
        if (idd.equals("w"))
        {
            imagev.setImageResource(R.drawable.W);
        }
        if (idd.equals("x"))
        {
            imagev.setImageResource(R.drawable.X);
        }
        if (idd.equals("y"))
        {
            imagev.setImageResource(R.drawable.Y);
        }
        if (idd.equals("z"))
        {
            imagev.setImageResource(R.drawable.Z);
        }

    }
}
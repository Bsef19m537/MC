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
            imagev.setImageResource(R.drawable.a);
        }
        if(idd.equals("b"))
        {
            imagev.setImageResource(R.drawable.b);
        }
        if (idd.equals("c"))
        {
            imagev.setImageResource(R.drawable.c);
        }
        if (idd.equals("d"))
        {
            imagev.setImageResource(R.drawable.d);
        }
        if (idd.equals("e"))
        {
            imagev.setImageResource(R.drawable.e);
        }
        if (idd.equals("f"))
        {
            imagev.setImageResource(R.drawable.f);
        }
        if (idd.equals("g"))
        {
            imagev.setImageResource(R.drawable.g);
        }
        if (idd.equals("h"))
        {
            imagev.setImageResource(R.drawable.h);
        }
        if (idd.equals("i"))
        {
            imagev.setImageResource(R.drawable.i);
        }
        if (idd.equals("j"))
        {
            imagev.setImageResource(R.drawable.j);
        }
        if (idd.equals("k"))
        {
            imagev.setImageResource(R.drawable.k);
        }
        if (idd.equals("l"))
        {
            imagev.setImageResource(R.drawable.l);
        }
        if (idd.equals("m"))
        {
            imagev.setImageResource(R.drawable.m);
        }
        if (idd.equals("n"))
        {
            imagev.setImageResource(R.drawable.n);
        }
        if (idd.equals("o"))
        {
            imagev.setImageResource(R.drawable.o);
        }
        if (idd.equals("p"))
        {
            imagev.setImageResource(R.drawable.p);
        }
        if (idd.equals("q"))
        {
            imagev.setImageResource(R.drawable.q);
        }
        if (idd.equals("r"))
        {
            imagev.setImageResource(R.drawable.r);
        }
        if (idd.equals("s"))
        {
            imagev.setImageResource(R.drawable.s);
        }
        if (idd.equals("t"))
        {
            imagev.setImageResource(R.drawable.t);
        }
        if (idd.equals("u"))
        {
            imagev.setImageResource(R.drawable.u);
        }
        if (idd.equals("v"))
        {
            imagev.setImageResource(R.drawable.v);
        }
        if (idd.equals("w"))
        {
            imagev.setImageResource(R.drawable.w);
        }
        if (idd.equals("x"))
        {
            imagev.setImageResource(R.drawable.x);
        }
        if (idd.equals("y"))
        {
            imagev.setImageResource(R.drawable.y);
        }
        if (idd.equals("z"))
        {
            imagev.setImageResource(R.drawable.z);
        }

    }
}
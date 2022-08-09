package com.example.kidsabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Book extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Button b1 = findViewById(R.id.A);
        b1.setOnClickListener( this ) ;

        Button b2 =  findViewById(R.id.B) ;
        b2.setOnClickListener( this ) ;

        Button b3 =  findViewById(R.id.C) ;
        b3.setOnClickListener( this ) ;

        Button b4 =  findViewById(R.id.D) ;
        b4.setOnClickListener( this ) ;

        Button b5 =  findViewById(R.id.E) ;
        b5.setOnClickListener( this ) ;

        Button b6 =  findViewById(R.id.F) ;
        b6.setOnClickListener( this ) ;

        Button b7 =  findViewById(R.id.G) ;
        b7.setOnClickListener( this ) ;

        Button b8 =  findViewById(R.id.H) ;
        b8.setOnClickListener( this ) ;

        Button b9 =  findViewById(R.id.I) ;
        b9.setOnClickListener( this ) ;

        Button b10 =  findViewById(R.id.J) ;
        b10.setOnClickListener( this ) ;

        Button b11 =  findViewById(R.id.K) ;
        b11.setOnClickListener( this ) ;

        Button b12 =  findViewById(R.id.L) ;
        b12.setOnClickListener( this ) ;

        Button b13 =  findViewById(R.id.M) ;
        b13.setOnClickListener( this ) ;

        Button b14 =  findViewById(R.id.N) ;
        b14.setOnClickListener( this ) ;

        Button b15 =  findViewById(R.id.O) ;
        b15.setOnClickListener( this ) ;

        Button b16 =  findViewById(R.id.P) ;
        b16.setOnClickListener( this ) ;

        Button b17 =  findViewById(R.id.Q) ;
        b17.setOnClickListener( this ) ;

        Button b18 =  findViewById(R.id.R) ;
        b18.setOnClickListener( this ) ;

        Button b19 =  findViewById(R.id.S) ;
        b19.setOnClickListener( this ) ;

        Button b20 =  findViewById(R.id.T) ;
        b20.setOnClickListener( this ) ;

        Button b21 =  findViewById(R.id.U) ;
        b21.setOnClickListener( this ) ;

        Button b22 =  findViewById(R.id.V) ;
        b22.setOnClickListener( this ) ;

        Button b23 =  findViewById(R.id.W) ;
        b23.setOnClickListener( this ) ;

        Button b24 =  findViewById(R.id.X) ;
        b24.setOnClickListener( this ) ;

        Button b25 =  findViewById(R.id.Y) ;
        b25.setOnClickListener( this ) ;

        Button b26 =  findViewById(R.id.Z) ;
        b26.setOnClickListener( this ) ;

    }

    @Override
    public void onClick(View view) {

    }
}
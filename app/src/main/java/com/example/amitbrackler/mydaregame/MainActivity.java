package com.example.amitbrackler.mydaregame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //#1 Defined a set of dares
    private String[] dares = {
            "Go Outside And Dance Like A Cowboy.",
            "Do A Model Runway Walk Outside On The Sidewalk.",
            "Pour A Cup Of Ice Cold Or Hot Water On Yourself Outside",
            "Stand In You Front Yard, Wave And Say ‘Hi!’ To Everyone You See.",
            "Call Your Crush And Explain The Rules Of Monopoly To Him/Her.",
            "You Must Ask The Group For Permission To Use The Bathroom For The Rest Of The Night."
    };

    //#2 defined view objects
    private Button buttonFindDare;
    private TextView textViewDare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //#3 initialized view objects
        textViewDare = findViewById(R.id.textViewDare);
        buttonFindDare = findViewById(R.id.buttonFindDare);

        buttonFindDare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random rand = new Random();
                int i = rand.nextInt(dares.length - 1);

                String dare = dares[i];

                textViewDare.setText(dare);
            }
        });
    }
}

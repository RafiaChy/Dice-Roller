package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView diceImage1, diceImage2;
    private Random randomNum1 = new Random();
    private Random randomNum2 = new Random();
    private int score;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    public void pressPlay(View view){

        diceImage1 = findViewById(R.id.diceRoll1);
        diceImage2 = findViewById(R.id.diceRoll2);

        int myRandomNumber1 = randomNum1.nextInt(6)+1;

        switch (myRandomNumber1)
        {
            case 1:
                diceImage1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                diceImage1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                diceImage1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                diceImage1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                diceImage1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                diceImage1.setImageResource(R.drawable.dice6);
                break;

        }


        int myRandomNumber2 = randomNum2.nextInt(6)+1;

        switch (myRandomNumber2)
        {
            case 1:
                diceImage2.setImageResource(R.drawable.dice7);
                break;
            case 2:
                diceImage2.setImageResource(R.drawable.dice8);
                break;
            case 3:
                diceImage2.setImageResource(R.drawable.dice9);
                break;
            case 4:
                diceImage2.setImageResource(R.drawable.dice10);
                break;
            case 5:
                diceImage2.setImageResource(R.drawable.dice11);
                break;
            case 6:
                diceImage2.setImageResource(R.drawable.dice12);
                break;

        }


    }

}
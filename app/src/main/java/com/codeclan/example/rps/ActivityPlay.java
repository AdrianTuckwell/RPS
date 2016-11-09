package com.codeclan.example.rps;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class ActivityPlay extends AppCompatActivity{

    Button mRockButton;
    Button mPaperButton;
    Button mScissorsButton;


    @Override
    protected void  onCreate(Bundle savedInstanceState){

        Log.d("RPS", "PlayActivity onCreate called");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        mRockButton = (Button)findViewById(R.id.rock_button);
        mRockButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d("RPS", "Rock button Pressed");

                String rock = "Rock";

                Intent intent = new Intent(ActivityPlay.this, ActivityResult.class);
                intent.putExtra("play",rock);
                startActivity(intent);
            }
        });


        mPaperButton = (Button)findViewById(R.id.paper_button);
        mPaperButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d("RPS", "Paper button Pressed");

                String paper = "Paper";

                Intent intent = new Intent(ActivityPlay.this, ActivityResult.class);
                intent.putExtra("play",paper);
                startActivity(intent);
            }
        });

        mScissorsButton = (Button)findViewById(R.id.scissors_button);
        mScissorsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d("RPS", "Scissors button Pressed");
                String scissors = "Scissors";

                Intent intent = new Intent(ActivityPlay.this, ActivityResult.class);
                intent.putExtra("play",scissors);
                startActivity(intent);
            }
        });

    }


}
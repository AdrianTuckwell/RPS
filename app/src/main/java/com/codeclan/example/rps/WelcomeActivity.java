package com.codeclan.example.rps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity
{

    Button mPlayButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        Log.d("RPS", "onCreate called");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mPlayButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.d("RPS", "Play button Pressed");

                Intent intent = new Intent(WelcomeActivity.this, ActivityPlay.class);

                startActivity(intent);

            }
        });

    }
}

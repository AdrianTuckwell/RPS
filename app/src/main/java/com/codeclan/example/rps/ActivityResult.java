package com.codeclan.example.rps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 09/11/2016.
 */

public class ActivityResult extends AppCompatActivity {

    Button mReturnButton;
    TextView mResultText;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {

        Log.d("RPS", "Result Activity onCreate called");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResultText = (TextView)findViewById(R.id.result_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String play = extras.getString("play");

        RockPaperScissors game = new RockPaperScissors(play);

        String result = game.getResult();






//        String result = "Bobby played Rock, Computer played Scissors:  Bobby Wins!!!";


        mResultText.setText(result);


        mReturnButton = (Button) findViewById(R.id.return_button);
        mReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("RPS", "Return button Pressed");
                Intent intent = new Intent(ActivityResult.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });

    }

}

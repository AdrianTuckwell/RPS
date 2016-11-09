package com.codeclan.example.rps;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class RockPaperScissors {

    //    EditText mPlayerName;
    HashMap<String, String> moves = new HashMap<>();
    String mPlayerMove;



    public RockPaperScissors(String move) {
        this.mPlayerMove = move;
        setUpMoves();
    }


    public void setUpMoves() {
        moves.put("Scissors", "Paper");
        moves.put("Paper", "Rock");
        moves.put("Rock", "Scissors");
    }

    public String computerMove() {
        Random rand = new Random();
        ArrayList<String> movesArray = new ArrayList<>();
        for(String key : moves.keySet()) {
            movesArray.add(key);
        }
        int randomIndex = rand.nextInt(3);
        String randomAnswer = movesArray.get(randomIndex);
        return randomAnswer;
    }

    public boolean win() {
        return (moves.get(mPlayerMove) == computerMove());
    }

    public boolean draw(){
        return (mPlayerMove == computerMove());
    }
    public boolean lose(){
        return (moves.get(computerMove())== (mPlayerMove));
    }

    public String getResult(){
        String outcome = null;
        if( win()){
            outcome = "You win!";
        }
        else if(lose()){
            outcome = "Computer wins!";
        }
        else{
            outcome = "It's a draw!";
        }
        return outcome;
    }





}
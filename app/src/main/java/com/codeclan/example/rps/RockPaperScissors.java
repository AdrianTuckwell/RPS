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

public class RockPaperScissors
{

    HashMap<String, String> moves = new HashMap<>();
    String mPlayerMove;
    String mComputerMove;

    public RockPaperScissors(String move)
    {
        this.mPlayerMove = move;
        this.mComputerMove = null;
        setUpMoves();
    }

    // Hash map of winning moves...
    public void setUpMoves()
    {
        //         Key...      Value...
        moves.put("Scissors", "Paper");     // Scissors beats Paper
        moves.put("Paper", "Rock");         // Paper beats Rock
        moves.put("Rock", "Scissors");      // Rock beats Scissors
    }

    public void computerMove()
    {
        // create a random computer move...
        // with a random object and Array list to hold moves
        Random rand = new Random();
        ArrayList<String> movesArray = new ArrayList<>();

        for(String key : moves.keySet())
        {
            movesArray.add(key);
        }

        int randomIndex = rand.nextInt(3);

        String randomAnswer = movesArray.get(randomIndex);

        this.mComputerMove = randomAnswer;
    }

    public boolean win()
    {
        return (moves.get(mPlayerMove).equals(mComputerMove));
    }

    public boolean lose()
    {
        return (moves.get(mComputerMove).equals((mPlayerMove)));
    }

    public String getResult()
    {

        computerMove();
        String outcome = null;
        if( win())
        {
            outcome = "You win!";
        }
        else if(lose())
        {
            outcome = "Computer wins!";
        }
        else
        {
            outcome = "It's a draw!";
        }
        return outcome;
    }





}
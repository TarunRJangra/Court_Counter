package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    boolean fg = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    displayForTeamA(0);
    displayForTeamB(0);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void for2points(View view){
        emptyString();
       scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }

    public void for3points(View view) {
        emptyString();
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void forFreeThrowpoints(View view){
        emptyString();
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    public void for2pointsB(View view){
        emptyString();
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }

    public void for3pointsB(View view){
        emptyString();
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }

    public void forFreeThrowpointsB(View view){
        emptyString();
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);


    }
    public void reset(View view){
            scoreTeamB = 0;
            scoreTeamA = 0;

            displayForTeamB(scoreTeamB);
            displayForTeamA(scoreTeamA);

            if(fg==false) {
                displayResult(" Score is now reset to 0  !");
            }
            else if(fg ==true)
        {
            displayResult("Score Already Reset");
        }
            fg=true;

    }

    public void emptyString()
    {
        if (fg == true) {
            displayResult(" ");
            fg =false;
            return;
        }
    }


    public void Calculate (View view) {
       emptyString();
            if (scoreTeamA > scoreTeamB)
                displayResult("Team A Won!");
            else if (scoreTeamB > scoreTeamA)
                displayResult("Team B Won!");
            else if (scoreTeamA == 0 && scoreTeamB == 0) {
                displayResult(" ");
            } else
                displayResult("Match Draw");
        }


    public void displayResult(String result){
        TextView resultView = (TextView) findViewById(R.id.result_display);
        resultView.setText(String.valueOf(result));
    }
}
package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.tag;

public class MainActivity extends AppCompatActivity {

    int teamScoreA = 0;
    int teamScoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score, String Team) {
        if (Team.equals("teamA")) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
            scoreView.setText(String.valueOf(score));
        }
        else {
            TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
            scoreView.setText(String.valueOf(score));
        }
    }




    public void Points_3(View view){
        String tag = view.getTag().toString();
        if (tag.equals("teamA")) {
            teamScoreA += 3;
            displayForTeamA(teamScoreA, tag);
        }
        else {
            teamScoreB += 3;
            displayForTeamA(teamScoreB,tag);
        }
    }

    public void Points_2(View view){
        String tag = view.getTag().toString();
        if (tag.equals("teamA")) {
            teamScoreA += 2;
            displayForTeamA(teamScoreA,tag);
        }
        else {
            teamScoreB += 2;
            displayForTeamA(teamScoreB,tag);
        }
    }

    public void freeThrow(View view){
        String tag = view.getTag().toString();
        if (tag.equals("teamA")) {
            teamScoreA += 1;
            displayForTeamA(teamScoreA,tag);
        }
        else {
            teamScoreB += 1;
            displayForTeamA(teamScoreB,tag);
        }
    }

    public void Reset(View v){
        teamScoreA = 0;
        teamScoreB = 0;
        displayForTeamA(teamScoreA,"teamA");
        displayForTeamA(teamScoreB,"teamB");

    }
}

package com.example.gurjeet.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int atotal=0,btotal=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View v) {
        atotal=btotal=0;
        displayForTeamA(atotal);
        displayForTeamB(btotal);
    }
    public void athree(View v) {
        atotal+=3;
        displayForTeamA(atotal);
    }

    public void atwo(View v) {
        atotal+=2;
        displayForTeamA(atotal);
    }
    public void aone(View v) {
        atotal+=1;
        displayForTeamA(atotal);
    }
    /**
     * Displays the given score for Team A.

    */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ascore);
        scoreView.setText(String.valueOf(score));
    }
    public void bthree(View v) {
        btotal+=3;
        displayForTeamB(btotal);
    }

    public void btwo(View v) {
        btotal+=2;
        displayForTeamB(btotal);
    }
    public void bone(View v) {
        btotal+=1;
        displayForTeamB(btotal);
    }
    /**
     * Displays the given score for Team A.

     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.bscore);
        scoreView.setText(String.valueOf(score));
    }
}

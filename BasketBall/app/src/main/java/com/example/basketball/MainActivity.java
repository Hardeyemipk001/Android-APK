package com.example.basketball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button btn=(Button)findViewById(R.id.reset);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(),"Reset Successful",Toast.LENGTH_SHORT).show();
//            }
//        });
//        displayForTeamA(0);

        Button refresh=(Button)findViewById(R.id.reset);
//
    }
    public void displayForTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }

    public void AddThreeForTeamA(View view) {
        displayForTeamA(scoreTeamA);
        scoreTeamA = scoreTeamA + 3;
    }
    public void AddTwoForTeamA(View view) {
        displayForTeamA(scoreTeamA);
        scoreTeamA = scoreTeamA + 2;
    }
    public void AddOneForTeamA(View view) {
        displayForTeamA(scoreTeamA);
        scoreTeamA = scoreTeamA + 1;
    }
    public void btn(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    // Team B start here
    public void AddThreeForTeamB(View view) {
        displayForTeamB(scoreTeamB);
        scoreTeamB = scoreTeamB + 3;
    }
    public void AddTwoForTeamB(View view) {
        displayForTeamB(scoreTeamB);
        scoreTeamB= scoreTeamB + 2;
    }
    public void AddOneForTeamB(View view) {
        displayForTeamB(scoreTeamB);
        scoreTeamB = scoreTeamB + 1;
    }
    }

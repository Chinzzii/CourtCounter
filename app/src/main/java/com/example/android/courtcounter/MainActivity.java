package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int pointsA = 0;
    int pointsB = 0;
    private TextView scoreA;
    private TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreA = (TextView) findViewById(R.id.PointsA_textView);
        scoreB = (TextView) findViewById(R.id.PointsB_textView);
    }

    public void displayScoreA(int score){
        scoreA.setText(""+ score);
    }
    public void displayScoreB(int score){
        scoreB.setText(""+ score);
    }

    public void add3A(View view) {
        pointsA = pointsA + 3;
        displayScoreA(pointsA);
    }

    public void add2A(View view) {
        pointsA = pointsA + 2;
        displayScoreA(pointsA);
    }

    public void add1A(View view) {
        pointsA = pointsA + 1;
        displayScoreA(pointsA);
    }

    public void add3B(View view) {
        pointsB = pointsB + 3;
        displayScoreB(pointsB);
    }

    public void add2B(View view) {
        pointsB = pointsB + 2;
        displayScoreB(pointsB);
    }

    public void add1B(View view) {
        pointsB = pointsB + 1;
        displayScoreB(pointsB);
    }

    public void resetScore(View view) {
        pointsA = 0;
        pointsB = 0;
        displayScoreA(pointsA);
        displayScoreB(pointsB);
    }
}
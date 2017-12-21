package com.example.hasan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreDisplay = 0;
    int scoreDisplayB=0;
    private TextView team;
    private TextView score;
    private Button three;
    private Button two;
    private Button free;
    private TextView scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        team = (TextView) findViewById(R.id.teamID);
        score = (TextView) findViewById(R.id.scoreID);
        three = (Button) findViewById(R.id.threeID);
        two = (Button) findViewById(R.id.twoID);
        free = (Button) findViewById(R.id.freeThrowID);
        scoreB = (TextView)findViewById(R.id.scoreIDB);

    }

    public void display() {

        score.setText("" + scoreDisplay);

    }
    public void displayB() {

        scoreB.setText(""+ scoreDisplayB);

    }

    public void reset(View view) {
        scoreDisplay = 0;
        scoreDisplayB = 0;
        displayB();
        display();
    }

    public void threePointsB(View view) {

        scoreDisplayB += 3;
        displayB();
    }

    public void twoPointsB(View view) {

        scoreDisplayB += 2;
        displayB();
    }

    public void freeThrowPointsB(View view) {
        scoreDisplayB += 4;
        displayB();

    }
    public void threePoints(View view) {

        scoreDisplay += 3;
        display();
    }

    public void twoPoints(View view) {

        scoreDisplay += 2;
        display();
    }

    public void freeThrowPoints(View view) {
        scoreDisplay += 4;
        display();

    }
}



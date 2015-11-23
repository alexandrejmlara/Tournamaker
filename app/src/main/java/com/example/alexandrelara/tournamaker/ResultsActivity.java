package com.example.alexandrelara.tournamaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ResultsActivity extends AppCompatActivity {

    int r = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.alexandrelara.tournamaker.R.layout.results);

        //check if extra intent was passed, specifically roundNumber
        if (this.getIntent().getExtras() != null && this.getIntent().getExtras().containsKey("roundNumber")) {
            int round = getIntent().getExtras().getInt("roundNumber");
            r = round;
        }
    }

    public void gotToNextRoundClick(View v){

        //Open the stats page
        Intent intent = new Intent(this, RoundActivity.class);

        //Update the round number by passing an extra with the intent
        r++;
        Intent roundIncrease = intent.putExtra("roundNumber", r);

        startActivity(intent);
    }


}

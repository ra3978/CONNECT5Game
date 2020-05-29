package com.example.connect5game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //0: blue; 1: black; 2: empty
    int activePlayer = 0;
    int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
    int[][] winningPositions = {{0, 1, 2, 3, 4},{5, 6, 7, 8, 9},{10, 11, 12, 13, 14},{15, 16, 17, 18, 19},{20, 21, 22, 23, 24},{0, 5, 10, 15, 20},{1, 6, 11, 16, 21},{2, 7, 12, 17, 23},{3, 8, 13, 18, 23},{4, 9, 14, 19, 24},{0, 6, 12, 18, 24},{4, 8, 12, 16, 20}};
    boolean gameActive = true;

    public void dropIn(View view){
        ImageView counter = (ImageView) view;
        int tappedCounter = Integer.parseInt(counter.getTag().toString());
        if (gameState[tappedCounter] == 2 && gameActive) {
            gameState[tappedCounter] = activePlayer;
            counter.setTranslationY(-1500);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.blue);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.black);
                activePlayer = 0;
            }
            counter.animate().translationYBy(1500).setDuration(1000);

            for (int[] winningPosition : winningPositions) {
                if (gameState[winningPosition[0]] == gameState[winningPosition[1]] && gameState[winningPosition[1]] == gameState[winningPosition[2]] && gameState[winningPosition[2]] == gameState[winningPosition[3]] && gameState[winningPosition[3]] == gameState[winningPosition[4]] && gameState[winningPosition[0]] != 2) {
                    //someone has won!

                    gameActive = false;

                    String winner;
                    if (activePlayer == 1) {
                        winner = "blue";
                    } else {
                        winner = "black";
                    }
                    //Toast.makeText(this, winner + " has won!", Toast.LENGTH_SHORT).show();
                    Button playAgainButton = (Button)findViewById(R.id.playAgainButton);
                    TextView winnerTextView = (TextView)findViewById(R.id.winnerTextView);
                    winnerTextView.setText(winner + " has won!");
                    playAgainButton.setVisibility(View.VISIBLE);
                    winnerTextView.setVisibility(View.VISIBLE);
                }

            }
        }
    }

    public void playAgain(View view) {
        Button playAgainButton = (Button) findViewById(R.id.playAgainButton);
        TextView winnerTextView = (TextView) findViewById(R.id.winnerTextView);
        playAgainButton.setVisibility(View.INVISIBLE);
        winnerTextView.setVisibility(View.INVISIBLE);

        GridLayout gridLayout = (GridLayout)findViewById(R.id.gridLayout);

        for (int i = 0; i < gridLayout.getChildCount(); i++){
            ImageView counter = (ImageView)gridLayout.getChildAt(i);
            counter.setImageDrawable(null);
        }

        ImageView counter1 = (ImageView)findViewById(R.id.imageView1);
        counter1.setImageDrawable(null);

        ImageView counter2 = (ImageView)findViewById(R.id.imageView2);
        counter2.setImageDrawable(null);

        ImageView counter3 = (ImageView)findViewById(R.id.imageView3);
        counter3.setImageDrawable(null);

        ImageView counter4 = (ImageView)findViewById(R.id.imageView4);
        counter4.setImageDrawable(null);

        ImageView counter5 = (ImageView)findViewById(R.id.imageView5);
        counter5.setImageDrawable(null);

        ImageView counter6 = (ImageView)findViewById(R.id.imageView6);
        counter6.setImageDrawable(null);

        ImageView counter7 = (ImageView)findViewById(R.id.imageView7);
        counter7.setImageDrawable(null);

        ImageView counter8 = (ImageView)findViewById(R.id.imageView8);
        counter8.setImageDrawable(null);

        ImageView counter9 = (ImageView)findViewById(R.id.imageView9);
        counter9.setImageDrawable(null);

        ImageView counter10 = (ImageView)findViewById(R.id.imageView10);
        counter10.setImageDrawable(null);

        ImageView counter11 = (ImageView)findViewById(R.id.imageView11);
        counter11.setImageDrawable(null);

        ImageView counter12 = (ImageView)findViewById(R.id.imageView12);
        counter12.setImageDrawable(null);

        ImageView counter13 = (ImageView)findViewById(R.id.imageView13);
        counter13.setImageDrawable(null);

        ImageView counter14 = (ImageView)findViewById(R.id.imageView14);
        counter14.setImageDrawable(null);

        ImageView counter15 = (ImageView)findViewById(R.id.imageView15);
        counter15.setImageDrawable(null);

        ImageView counter16 = (ImageView)findViewById(R.id.imageView16);
        counter16.setImageDrawable(null);

        ImageView counter17 = (ImageView)findViewById(R.id.imageView17);
        counter17.setImageDrawable(null);

        ImageView counter18 = (ImageView)findViewById(R.id.imageView18);
        counter18.setImageDrawable(null);

        ImageView counter19 = (ImageView)findViewById(R.id.imageView19);
        counter19.setImageDrawable(null);

        ImageView counter20 = (ImageView)findViewById(R.id.imageView20);
        counter20.setImageDrawable(null);

        ImageView counter21 = (ImageView)findViewById(R.id.imageView21);
        counter21.setImageDrawable(null);

        ImageView counter22 = (ImageView)findViewById(R.id.imageView22);
        counter22.setImageDrawable(null);

        ImageView counter23 = (ImageView)findViewById(R.id.imageView23);
        counter23.setImageDrawable(null);

        ImageView counter24 = (ImageView)findViewById(R.id.imageView24);
        counter24.setImageDrawable(null);

        ImageView counter25 = (ImageView)findViewById(R.id.imageView25);
        counter25.setImageDrawable(null);

        for(int j = 0; j < gameState.length; j++) {
            gameState[j] = 2;
        }
        activePlayer = 0;
        gameActive = true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

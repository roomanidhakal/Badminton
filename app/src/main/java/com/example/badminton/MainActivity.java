package com.example.badminton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int player1_score, player2_score, player1_win, player2_win;
    private TextView player1_textView, player2_textView, player1_win_text, player2_win_text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1_textView = findViewById(R.id.player1_count);
        player2_textView = findViewById(R.id.player2_count);
        player1_win_text = findViewById(R.id.win_count_player1);
        player2_win_text = findViewById(R.id.win_count_player2);
    }

    public void update_player1_point(View view)
    {
        player1_score = player1_score + 1;
        displayScore_player1(player1_score);
    }

    private void displayScore_player1(int score)
    {
        player1_textView.setText(String.valueOf(score));
    }

    public void update_player2_point(View view)
    {
        player2_score = player2_score + 1;
        displayScore_player2(player2_score);
    }

    private void displayScore_player2(int score)
    {
        player2_textView.setText(String.valueOf(score));
    }

    public void update_player1_game(View view)
    {
        player1_win = player1_win + 1;
        display_win_player1(player1_win);
    }

    private void display_win_player1(int score)
    {
        player1_win_text.setText(String.valueOf(score));
    }

    public void update_player2_game(View view)
    {
        player2_win = player2_win + 1;
        display_win_player2(player2_win);
    }

    private void display_win_player2(int score)
    {
        player2_win_text.setText(String.valueOf(score));
    }

    //Reset
    public void resetScore(View view)
    {
        player1_score = 0;
        player2_score = 0;
        player1_win = 0;
        player2_win = 0;
        displayScore_player1(player1_score);
        displayScore_player2(player2_score);
        display_win_player1(player1_win);
        display_win_player2(player2_win);
    }

}

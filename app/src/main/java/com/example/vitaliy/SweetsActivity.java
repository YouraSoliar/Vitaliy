package com.example.vitaliy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SweetsActivity extends AppCompatActivity {

    private ImageView imageViewFullSweets;
    private ImageView imageViewHalfSweets;
    private ImageView imageViewLastSweets;
    private ImageView imageViewEmptySweets;
    private TextView textViewAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageViewFullSweets = findViewById(R.id.imageViewFullSweets);
        imageViewHalfSweets = findViewById(R.id.imageViewHalfSweets);
        imageViewLastSweets = findViewById(R.id.imageViewLastSweets);
        imageViewEmptySweets = findViewById(R.id.imageViewEmptySweets);
        textViewAgain = findViewById(R.id.textViewAgain);

        imageViewFullSweets.setVisibility(View.VISIBLE);
        imageViewHalfSweets.setVisibility(View.GONE);
        imageViewLastSweets.setVisibility(View.GONE);
        imageViewEmptySweets.setVisibility(View.GONE);
        textViewAgain.setVisibility(View.GONE);

        imageViewFullSweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageViewFullSweets.setVisibility(View.GONE);
                imageViewHalfSweets.setVisibility(View.VISIBLE);
                imageViewLastSweets.setVisibility(View.GONE);
                imageViewEmptySweets.setVisibility(View.GONE);
                textViewAgain.setVisibility(View.GONE);

            }
        });

        imageViewHalfSweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imageViewFullSweets.setVisibility(View.GONE);
                imageViewHalfSweets.setVisibility(View.GONE);
                imageViewLastSweets.setVisibility(View.VISIBLE);
                imageViewEmptySweets.setVisibility(View.GONE);
                textViewAgain.setVisibility(View.GONE);

            }
        });

        imageViewLastSweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewFullSweets.setVisibility(View.GONE);
                imageViewHalfSweets.setVisibility(View.GONE);
                imageViewLastSweets.setVisibility(View.GONE);
                imageViewEmptySweets.setVisibility(View.VISIBLE);
                textViewAgain.setVisibility(View.VISIBLE);

            }
        });

        textViewAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewFullSweets.setVisibility(View.VISIBLE);
                imageViewHalfSweets.setVisibility(View.GONE);
                imageViewLastSweets.setVisibility(View.GONE);
                imageViewEmptySweets.setVisibility(View.GONE);
                textViewAgain.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
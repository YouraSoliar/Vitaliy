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

import com.bumptech.glide.Glide;

import java.io.IOException;

public class HookahActivity extends AppCompatActivity {

    private TextView textViewSmoke;
    private ImageView imageViewSmoke;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hookah);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textViewSmoke = findViewById(R.id.textViewSmoke);
        imageViewSmoke = findViewById(R.id.imageViewSmoke);
        imageViewSmoke.setVisibility(View.GONE);
        Glide.with(getApplicationContext()).load(R.drawable.smoke).into(imageViewSmoke);

        textViewSmoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CountDownTimer(2000, 2000) {
                    public void onTick(long millisUntilFinished) {
                        imageViewSmoke.setVisibility(View.VISIBLE);
                        mp = MediaPlayer.create(getApplicationContext(), R.raw.hookah_sound);

                        mp.start();

                    }

                    public void onFinish() {
                        imageViewSmoke.setVisibility(View.GONE);
                        mp.pause();
                        mp.release();
                        mp = null;
                    }
                }.start();
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
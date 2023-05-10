package com.example.vitaliy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GreetingActivity extends AppCompatActivity {

    private TextView textViewSecret;
    private TextView textViewGreeting;
    private TextView textViewPeoples;
    private ImageView imageViewGay;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textViewSecret = findViewById(R.id.textViewSecret);
        textViewGreeting = findViewById(R.id.textViewGreeting);
        textViewPeoples = findViewById(R.id.textViewPeoples);
        imageViewGay = findViewById(R.id.imageViewGay);
        imageViewGay.setVisibility(View.GONE);
        count = 0;
        textViewSecret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if (count == 10) {
                    count = 0;
                    imageViewGay.setVisibility(View.VISIBLE);
                    textViewSecret.setVisibility(View.GONE);
                    textViewGreeting.setVisibility(View.GONE);
                    textViewPeoples.setVisibility(View.GONE);
                }
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
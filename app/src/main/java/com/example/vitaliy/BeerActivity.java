package com.example.vitaliy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class BeerActivity extends AppCompatActivity {

    private ImageView imageViewFullBeer;
    private ImageView imageViewEmptyBeer;
    private TextView textViewAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageViewEmptyBeer = findViewById(R.id.imageViewEmptyBeer);
        textViewAgain = findViewById(R.id.textViewAgain);
        imageViewFullBeer = findViewById(R.id.imageViewFullBeer);

        imageViewFullBeer.setVisibility(View.VISIBLE);
        imageViewEmptyBeer.setVisibility(View.GONE);
        textViewAgain.setVisibility(View.GONE);

        imageViewFullBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewFullBeer.setVisibility(View.GONE);
                imageViewEmptyBeer.setVisibility(View.VISIBLE);
                textViewAgain.setVisibility(View.VISIBLE);
            }
        });

        textViewAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewFullBeer.setVisibility(View.VISIBLE);
                imageViewEmptyBeer.setVisibility(View.GONE);
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
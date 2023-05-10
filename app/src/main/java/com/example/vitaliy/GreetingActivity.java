package com.example.vitaliy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GreetingActivity extends AppCompatActivity {

    private TextView textViewSecret;
    private TextView textViewGreeting;
    private TextView textViewPeoples;
    private ImageView imageViewGay;
    private int count = 0;

    private ImageView imageViewYurii;
    private ImageView imageViewTanya;
    private ImageView imageViewOlia;
    private ImageView imageViewNazar;
    private ImageView imageViewAndriy;
    private ImageView imageViewIvanka;
    private ImageView imageViewAlina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textViewSecret = findViewById(R.id.textViewSecret);
        textViewGreeting = findViewById(R.id.textViewGreeting);
        textViewPeoples = findViewById(R.id.textViewPeoples);
        imageViewGay = findViewById(R.id.imageViewGay);

        imageViewYurii = findViewById(R.id.imageViewYurii);
        imageViewTanya = findViewById(R.id.imageViewTanya);
        imageViewOlia = findViewById(R.id.imageViewOlia);
        imageViewNazar = findViewById(R.id.imageViewNazar);
        imageViewAndriy = findViewById(R.id.imageViewAndriy);
        imageViewIvanka = findViewById(R.id.imageViewIvanka);
        imageViewAlina = findViewById(R.id.imageViewAlina);

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

        imageViewYurii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GreetingActivity.this, "Юра", Toast.LENGTH_SHORT).show();
            }
        });
        imageViewTanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GreetingActivity.this, "Таня", Toast.LENGTH_SHORT).show();
            }
        });
        imageViewOlia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GreetingActivity.this, "Оля", Toast.LENGTH_SHORT).show();
            }
        });
        imageViewNazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GreetingActivity.this, "Назар", Toast.LENGTH_SHORT).show();
            }
        });
        imageViewAndriy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GreetingActivity.this, "Андрій", Toast.LENGTH_SHORT).show();
            }
        });
        imageViewIvanka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GreetingActivity.this, "Іванка", Toast.LENGTH_SHORT).show();
            }
        });
        imageViewAlina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GreetingActivity.this, "Аліна", Toast.LENGTH_SHORT).show();
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
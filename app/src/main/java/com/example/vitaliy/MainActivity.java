package com.example.vitaliy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewBeer;
    private ImageView imageViewHookah;
    private ImageView imageViewSweets;
    private ImageView imageViewGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewBeer = findViewById(R.id.imageViewBeer);
        imageViewHookah = findViewById(R.id.imageViewHookah);
        imageViewSweets = findViewById(R.id.imageViewSweets);
        imageViewGreeting = findViewById(R.id.imageViewGreeting);

        imageViewBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BeerActivity.class);
                startActivity(intent);
            }
        });

        imageViewHookah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HookahActivity.class);
                startActivity(intent);
            }
        });

        imageViewSweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SweetsActivity.class);
                startActivity(intent);
            }
        });

        imageViewGreeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GreetingActivity.class);
                startActivity(intent);
            }
        });

    }
}
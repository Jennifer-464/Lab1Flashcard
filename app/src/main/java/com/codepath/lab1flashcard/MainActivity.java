package com.codepath.lab1flashcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer).setVisibility(View.VISIBLE);
                findViewById(R.id.question).setVisibility(View.GONE);
            }
        });
        findViewById(R.id.answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.answer).setVisibility(View.GONE);
                findViewById(R.id.question).setVisibility(View.VISIBLE);
            }
        });
    }
}

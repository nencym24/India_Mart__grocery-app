package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Intro1Activity extends AppCompatActivity {

    FrameLayout next;
    TextView skip;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);

        next = findViewById(R.id.next);
        skip = findViewById(R.id.skip);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intro1Activity.this,Intro2Activity.class);
                startActivity(intent);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intro1Activity.this,LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}
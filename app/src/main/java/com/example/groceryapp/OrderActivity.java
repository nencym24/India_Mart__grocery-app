package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OrderActivity extends AppCompatActivity {


    CardView CancelOrder;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        CancelOrder = findViewById(R.id.CancelOrder);

        CancelOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OrderActivity.this,DeliveryStatusActivity.class);
                startActivity(intent);
            }
        });
    }
}
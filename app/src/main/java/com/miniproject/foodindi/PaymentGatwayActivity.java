package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class PaymentGatwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_gatway);
    }

    public void gotoOrderPlacedActivity(View view) {
        Intent intent = new Intent(PaymentGatwayActivity.this, OrderPlacedActivity.class);
        startActivity(intent);
        Bungee.diagonal(this);
    }

}
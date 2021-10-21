package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }

    // Going from one Activity to another through onClick
    public void gotoPaymentMethodActivity(View view) {
        Intent intent = new Intent(CartActivity.this, PaymentMethodActivity.class);
        startActivity(intent);
        Bungee.shrink(this);
    }

}
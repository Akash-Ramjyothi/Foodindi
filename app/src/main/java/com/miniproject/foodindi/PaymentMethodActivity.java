package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class PaymentMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
    }

    // Going from one Activity to another through onClick
    public void gotoPaymentGatewayActivity(View view) {
        Intent intent = new Intent(PaymentMethodActivity.this, PaymentGatwayActivity.class);
        startActivity(intent);
        Bungee.diagonal(this);
    }

}
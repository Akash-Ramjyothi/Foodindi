package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class OrderPlacedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_placed);
    }

    public void gotoProfileActivity(View view) {
        Intent intent = new Intent(OrderPlacedActivity.this, ProfileActivity.class);
        startActivity(intent);
        Bungee.slideUp(this);
    }

}
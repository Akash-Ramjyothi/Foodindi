package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class SingleFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_food);
    }

    // Going from one Activity to another through onClick
    public void gotoCartActivity(View view) {
        Intent intent = new Intent(SingleFoodActivity.this, CartActivity.class);
        startActivity(intent);
        Bungee.slideDown(this);
    }
}
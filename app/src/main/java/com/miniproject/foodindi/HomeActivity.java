package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    // Going from one Activity to another through onClick
    public void gotoSearchActivity(View view) {
        Intent intent = new Intent(HomeActivity.this, SearchActivity.class);
        startActivity(intent);
        Bungee.swipeRight(this);
    }

    // Going from one Activity to another through onClick
    public void gotoSingleFoodActivity(View view) {
        Intent intent = new Intent(HomeActivity.this, SingleFoodActivity.class);
        startActivity(intent);
        Bungee.inAndOut(this);
    }

}
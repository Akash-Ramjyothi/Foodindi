package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void gotoOrderCompleteActivity(View view) {
        Intent intent = new Intent(ProfileActivity.this, OrderCompleteActivity.class);
        startActivity(intent);
        Bungee.split(this);
    }

}
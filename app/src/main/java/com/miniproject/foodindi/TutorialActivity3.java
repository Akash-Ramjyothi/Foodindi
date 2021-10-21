package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class TutorialActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3);
    }

    // Going from one Activity to another through onClick
    public void gotoCreateAccountActivity(View view) {
        Intent intent = new Intent(TutorialActivity3.this, CreateAccountActivity.class);
        startActivity(intent);
        Bungee.split(this);
    }

}
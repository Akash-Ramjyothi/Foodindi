package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class TutorialActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial2);
    }

    // Going from one Activity to another through onClick
    public void gotoTutorial3(View view) {
        Intent intent = new Intent(TutorialActivity2.this, TutorialActivity3.class);
        startActivity(intent);
        Bungee.slideLeft(this);
    }
}
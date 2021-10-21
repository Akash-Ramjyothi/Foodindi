package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class TutorialActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial1);
    }

    // Going from one Activity to another through onClick
    public void gotoTutorial2(View view) {
        Intent intent = new Intent(TutorialActivity1.this, TutorialActivity2.class);
        startActivity(intent);
        Bungee.slideLeft(this);
    }

}
package com.miniproject.foodindi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                // Code to go to Another Activity
                Intent intent = new Intent(MainActivity.this, TutorialActivity1.class);
                //startActivity(new Intent(MainActivity.this,TutorialActivity1.class));
                startActivity(intent);
            }
        },4000L);
        Bungee.slideLeft(this);
    }
}
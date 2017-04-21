package com.registrationapp.rehab.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static final long SPLASH_TIME=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent=new Intent().setClass(MainActivity.this,Main2Activity.class);
                startActivity(mainIntent);
                finish();
            }
        };
        Timer timer=new Timer();
        timer.schedule(task,SPLASH_TIME);
    }
}

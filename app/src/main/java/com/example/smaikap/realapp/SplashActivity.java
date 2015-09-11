package com.example.smaikap.realapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Runnable delayIt = new Runnable() {
            @Override
            public void run () {
                startNextActivity();
                finish();
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(delayIt, 3000);
    }

    private void startNextActivity () {
        Intent mainIntent = new Intent(this,MainActivity.class);
        startActivity(mainIntent);
    }
}

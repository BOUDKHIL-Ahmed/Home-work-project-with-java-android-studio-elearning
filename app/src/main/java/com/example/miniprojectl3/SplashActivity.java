package com.example.miniprojectl3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Changed from activity_splash to splash_activity to match your custom layout
        setContentView(R.layout.splash_activity);

        // Use Handler to create a 2-second delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Trigger Intent to start MenuActivity
                Intent intent = new Intent(SplashActivity.this, MenuActivity.class);
                startActivity(intent);

                // Close this activity so the user can't go back to it
                finish();
            }
        }, 2000); // 2000 milliseconds = 2 seconds
    }
}
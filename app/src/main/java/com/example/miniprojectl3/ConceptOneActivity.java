package com.example.miniprojectl3;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class ConceptOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concept_one);

        // Reference the layout to animate
        LinearLayout contentLayout = findViewById(R.id.content_layout);

        // Load and start the animation as required by project specs
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        contentLayout.startAnimation(fadeIn);
    }
}
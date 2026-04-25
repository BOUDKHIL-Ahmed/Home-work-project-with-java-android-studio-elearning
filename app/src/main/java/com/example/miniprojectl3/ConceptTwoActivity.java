package com.example.miniprojectl3;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class ConceptTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concept_two);

        // Target the layout for animation
        LinearLayout routingLayout = findViewById(R.id.routing_content);

        // Load and apply the slide_up animation [cite: 20]
        Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);
        routingLayout.startAnimation(slideUp);
    }
}
package com.example.miniprojectl3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Fixed: Use menu_activity layout which contains the buttons
        setContentView(R.layout.menu_activity);

        Button btnConcept1 = findViewById(R.id.btnConcept1);
        Button btnConcept2 = findViewById(R.id.btnConcept2);
        Button btnAbout = findViewById(R.id.btnAbout);

        // Navigate to Activity 3 (First Concept)
        if (btnConcept1 != null) {
            btnConcept1.setOnClickListener(v -> {
                startActivity(new Intent(MenuActivity.this, ConceptOneActivity.class));
            });
        }

        // Navigate to Activity 4 (Second Concept)
        if (btnConcept2 != null) {
            btnConcept2.setOnClickListener(v -> {
                startActivity(new Intent(MenuActivity.this, ConceptTwoActivity.class));
            });
        }

        // Navigate to Activity 5 (Developer Info)
        if (btnAbout != null) {
            btnAbout.setOnClickListener(v -> {
                startActivity(new Intent(MenuActivity.this, AboutActivity.class));
            });
        }
    }
}
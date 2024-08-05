package com.example.learningenglish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        ImageButton color_btn = findViewById(R.id.imageButton);
        ImageButton family_btn = findViewById(R.id.imageButton2);

        color_btn.setOnClickListener(new View.OnClickListener(

        ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, ColorScreen.class);
                startActivity(i);
            }
        });
        family_btn.setOnClickListener(new View.OnClickListener(

        ) {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this, FamilyScreen.class);
                startActivity(i);
            }
        });
    }
}
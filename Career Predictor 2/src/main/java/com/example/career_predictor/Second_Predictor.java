package com.example.career_predictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

public class Second_Predictor extends AppCompatActivity {

// BUTTON DETAILS
    public void Submit(View view) {
        startActivity(new Intent(getApplicationContext(), loading_2.class));
    }
}
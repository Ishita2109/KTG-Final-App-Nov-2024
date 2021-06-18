package com.example.aptitudetest;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity_Apti extends AppCompatActivity {
    Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_apti);
       // getSupportActionBar().setTitle("Aptitude Test");

        button = findViewById(R.id.button_apti);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity_Apti.this, Questions.class);
                startActivity(intent);
            }
        });
    }
}


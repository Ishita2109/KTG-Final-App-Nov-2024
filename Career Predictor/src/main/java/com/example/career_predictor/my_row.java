package com.example.career_predictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class my_row extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_row);
    }

    public void click(View view)
    {
        startActivity(new Intent(getApplicationContext(), Loading.class));
    }
}
package com.example.career_predictor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class row_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.row_2);
    }

    public void click(View view)
    {
        startActivity(new Intent(getApplicationContext(), loading_2.class));
    }
}
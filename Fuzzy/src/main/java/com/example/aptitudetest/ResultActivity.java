package com.example.aptitudetest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;
import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {
    TextView tvDesc;
    ArrayList<Model> total = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvDesc = (TextView) findViewById(R.id.tvDesc);
        tvDesc.setText(HtmlCompat.fromHtml(getIntent().getStringExtra("desc"),0));
        tvDesc.setMovementMethod(new ScrollingMovementMethod());
    }
}
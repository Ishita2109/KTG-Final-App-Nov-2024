package com.example.referafriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Refer extends AppCompatActivity {
    Button sharebtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refer);


                sharebtn = findViewById(R.id.share_btn);
                sharebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent shareIntent = new Intent(Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        String shareBody="Download this application now:https://play.google.com/store/apps/details?id=com.truecaller";
                        String sharesub="KnowToGrow";

                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                        shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody);

                        startActivity(Intent.createChooser(shareIntent, "Share Using"));


                    }
                });
            }
        }

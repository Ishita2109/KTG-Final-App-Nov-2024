package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import com.example.navigationtry.Home;

public class login_form extends AppCompatActivity {
    Switch switch_btn;
    Button button_send;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_form);

         switch_btn= findViewById(R.id.switch_btn);
         button_send= findViewById(R.id.button_send);

         button_send.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(switch_btn.isChecked())
                 {
                     startActivity(new Intent(getApplicationContext(), Admin.class));
                 }
                 else
                 {
                     startActivity(new Intent(getApplicationContext(), Home.class));
                 }
             }
         });
    }

    public void btn_signupForm(View view) {

        startActivity(new Intent(getApplicationContext(), Signup_form.class));
    }
}

   
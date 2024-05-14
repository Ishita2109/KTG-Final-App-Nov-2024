
package com.example.logo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_admin);
    }



    public void btn_logout(View view) {
        startActivity(new Intent(getApplicationContext(), login_form.class));
    }


}
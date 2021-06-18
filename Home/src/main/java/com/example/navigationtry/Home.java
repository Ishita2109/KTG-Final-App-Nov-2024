package com.example.navigationtry;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;


import com.example.aboutus.AboutUs;

import com.example.aptitudetest.MainActivity_Apti;
import com.example.contactus.ContactUs;
import com.example.feed_back.Feedback_New;

import com.example.career_predictor.Career_Predictor;


import com.example.referafriend.Refer;
import com.google.android.material.navigation.NavigationView;
import com.sujeet.chatappdesign.expert;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

  private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

      navigationView.setNavigationItemSelectedListener(this);



       mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setDrawerLayout(drawer)
                .build();
       
        //NavController navController = Navigation.findNavController(this, R.id.navigationview);
        //NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
          //    NavigationUI.setupWithNavController(navigationView, navController);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.about_us) {
            Intent intent = new Intent(this, AboutUs.class);
            startActivity(intent);
        } else if (itemId == R.id.terms) {
            Intent intent = new Intent(this, Terms.class);
            startActivity(intent);
        }
        else if (itemId == R.id.contact_us) {
            Intent intent = new Intent(this, ContactUs.class);
            startActivity(intent);
        }
        else if (itemId == R.id.feedback) {
            Intent intent = new Intent(this, Feedback_New.class);
            startActivity(intent);
        }
        else if (itemId == R.id.refer) {
            Intent intent = new Intent(this, Refer.class);
            startActivity(intent);
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.navigationview);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
          || super.onSupportNavigateUp();
   }

   public void btn_faq(View view) {
       Intent i = new Intent(this, FAQ.class);
        startActivity(i);
   }

    public void btn_ask(View view) {
        Intent i = new Intent(this, expert.class);
        startActivity(i);

    }

    public void btn_career(View view) {
        Intent i = new Intent(this, Career_Predictor.class);
        startActivity(i);
    }

    public void btn_apti(View view) {
        Intent i = new Intent(this, MainActivity_Apti.class);
        startActivity(i);
    }

}



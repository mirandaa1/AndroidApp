package com.example.android_application;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class HomePage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    //Variablat
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Menu menu = navigationView.getMenu();
        menu.findItem(R.id.nav_logout).setVisible(false);
        menu.findItem(R.id.nav_profile).setVisible(false);

        navigationView.bringToFront();


        // select toolbar as our actionbar
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_books);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {

            case R.id.nav_books:
                Intent intent = new Intent(HomePage.this, Books.class);
                startActivity(intent);
                break;


            case R.id.nav_authors:
                Intent intent1 = new Intent(HomePage.this, Authors.class);
                startActivity(intent1);
                break;
            case R.id.nav_us:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }
}




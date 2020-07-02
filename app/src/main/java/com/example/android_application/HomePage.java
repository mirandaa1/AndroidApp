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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.navigation.NavigationView;

public class HomePage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    //Variablat
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Fragment fragment = null;


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
        menu.findItem(R.id.nav_logout).setVisible(true);


        navigationView.bringToFront();

        // select toolbar as our actionbar
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_technology);
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

            case R.id.nav_technology:
                Intent intent = new Intent(HomePage.this, TechnologyBooks.class);
                startActivity(intent);
                break;

            case R.id.nav_top5:
                Intent intent2 = new Intent(HomePage.this, MultipleFragments.class);
                startActivity(intent2);
                break;


            case R.id.nav_authors:
                Intent intent1 = new Intent(HomePage.this, Authors.class);
                startActivity(intent1);

                break;
            case R.id.nav_notes:

                Intent intent6 = new Intent(HomePage.this, Notes.class);
                startActivity(intent6);

                break;
            case R.id.nav_prof:
                Intent intent6 = new Intent(HomePage.this, Profile.class);
                startActivity(intent6);
                break;
            case R.id.nav_logout:
                Intent intent4 = new Intent(HomePage.this, Login.class);
                startActivity(intent4);
                break;

            case R.id.nav_us:
                Intent intent7 = new Intent(HomePage.this, AboutUs.class);
                startActivity(intent7);
                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}




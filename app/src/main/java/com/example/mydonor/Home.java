package com.example.mydonor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.drawer_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.nv_settings:
                Intent s = new Intent(Home.this, Home.class);
                startActivity(s);
                return true;

            case R.id.preferences:
                Intent p = new Intent(Home.this, Donor.class);
                startActivity(p);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void update(View view) {
        Intent i = new Intent(getApplicationContext(), Update_profile.class);
        Toast.makeText(Home.this, "Profile Updated", Toast.LENGTH_SHORT).show();
        startActivity(i);
        finish();
    }
    public void want(View view) {
        Intent i = new Intent(getApplicationContext(), Donor.class);
        startActivity(i);
        finish();
    }
    public void donor(View view) {
        Intent i = new Intent(getApplicationContext(), Donors.class);
        startActivity(i);
        finish();
    }
       public void bank(View view) {
        Intent i = new Intent(getApplicationContext(), Blood_Bank.class);
        startActivity(i);
        finish();
    }
}
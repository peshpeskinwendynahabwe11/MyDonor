package com.example.mydonor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Spinner spinner;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        spinner = findViewById(R.id.Spinner);
        String [] bloodGroup= {"A-","A+","B-","AB","O","B+"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,bloodGroup);
        spinner.setAdapter(adapter);

    }
    public void sign(View view) {
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
        finish();
    }
    public void Submit(View view) {
        Toast.makeText(this,"Registered successfully",Toast.LENGTH_LONG).show();
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
        finish();
    }

}
package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Intent intent;
    String value = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        intent = getIntent();
        value = intent.getStringExtra("option");
//        value = getIntent().getStringExtra("option");
        Toast.makeText(this, "Option  =  "+value, Toast.LENGTH_SHORT).show();

    }
}
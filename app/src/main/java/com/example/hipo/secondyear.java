package com.example.hipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class secondyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondyear);
    }

    public void secondsec1(View view) {
        Intent intent = new Intent(secondyear.this, Secondsec1.class);
        startActivity(intent);
    }

    public void secondsec2(View view) {
        Intent intent = new Intent(secondyear.this, secondsec2.class);
        startActivity(intent);
    }
}
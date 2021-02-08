package com.example.hipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fourthyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthyear);
    }

    public void fourthsec1(View view) {
        Intent intent = new Intent(fourthyear.this, fourthsec1.class);
        startActivity(intent);
    }

    public void fourthsec2(View view) {
        Intent intent = new Intent(fourthyear.this, fourthsec2.class);
        startActivity(intent);
    }
}
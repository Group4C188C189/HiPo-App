package com.example.hipo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class firstyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstyear);
    }

    public void firstsec1(View view) {
        Intent intent = new Intent(firstyear.this, firstsec1.class);
        startActivity(intent);
    }

    public void firstsec2(View view) {
        Intent intent = new Intent(firstyear.this, firstsec2.class);
        startActivity(intent);
    }
}
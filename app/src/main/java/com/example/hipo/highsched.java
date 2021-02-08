package com.example.hipo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class highsched extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highsched);
    }

    public void firstyear(View view) {
        Intent intent = new Intent(highsched.this, firstyear.class);
        startActivity(intent);
    }

    public void secondyear(View view) {
        Intent intent = new Intent(highsched.this, secondyear.class);
        startActivity(intent);
    }

    public void thirdyear(View view) {
        Intent intent = new Intent(highsched.this, thirdyear.class);
        startActivity(intent);
    }

    public void fourthyear(View view) {
        Intent intent = new Intent(highsched.this, fourthyear.class);
        startActivity(intent);
    }
}
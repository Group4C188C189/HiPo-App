package com.example.hipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class thirdyear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdyear);
    }

    public void thirdsec1(View view) {
        Intent intent = new Intent(thirdyear.this, thirdsec1.class);
        startActivity(intent);
    }

    public void thirdsec2(View view) {
        Intent intent = new Intent(thirdyear.this, thirdsec2.class);
        startActivity(intent);
    }
}
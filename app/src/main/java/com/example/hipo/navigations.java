package com.example.hipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class  navigations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigations);
    }

    public void myprofile(View view) {
        Intent intent = new Intent(navigations.this, Profile.class);
        startActivity(intent);
    }

    public void hisched(View view) {
        Intent intent = new Intent(navigations.this, highsched.class);
        startActivity(intent);
    }


    public void aboutus(View view) {
        Intent intent = new Intent(navigations.this, aboutus.class);
        startActivity(intent);
    }
}
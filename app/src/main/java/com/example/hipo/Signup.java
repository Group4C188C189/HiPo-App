package com.example.hipo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Signup extends AppCompatActivity {

//private LinearLayout linear;
//private ImageView logo;
////private EditText fullname;
////private EditText idno;
////private EditText year;
////private EditText section;
////private EditText password;
//private Button signup_btn;
//private TextView signin_page;

    private EditText fullname , username , year, section, password;
    private Button signup_btn;
    private TextView  signin_page;
    private DataBaseHelper myDB;

//    EditText fullname, idno, year, section, password;

//private Intent in = new Intent();
//
//private SharedPreferences file;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_signup);
//        initialize(_savedInstanceState);
//        initializeLogic();

        fullname = (EditText) findViewById(R.id.fullname);
        username = (EditText) findViewById(R.id.username);
        year = (EditText) findViewById(R.id.year);
        section = (EditText) findViewById(R.id.section);
        password = (EditText) findViewById(R.id.password);
        signup_btn = (Button) findViewById(R.id.signup_btn);
        signin_page = (TextView) findViewById(R.id.signin_page);

        myDB = new DataBaseHelper(this);
        insertUser();
        signin_page();
    }

//    private void insertUser(){
//        signup_btn.setOnClickListener(v -> {
//            boolean var = myDB.registerUser(fullname.getText().toString() , username.getText().toString() , year.getText().toString()
//            , section.getText().toString(), password.getText().toString());
//            if(var){
//                Toast.makeText(Signup.this, "User Registered Successfully !!", Toast.LENGTH_SHORT).show();
//            }
//            else
//                Toast.makeText(Signup.this, "Registration Error !!", Toast.LENGTH_SHORT).show();
//        });
//    }

    private void insertUser(){
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean var = myDB.registerUser(fullname.getText().toString() , username.getText().toString() , year.getText().toString(), section.getText().toString(), password.getText().toString());
                if(var){
                    Toast.makeText(Signup.this, "User Registered Successfully !!", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(Signup.this, "Registration Error !!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void signin_page(){
        signin_page.setOnClickListener(v -> {
            startActivity(new Intent(Signup.this , MainActivity.class));
            finish();
        });
    }



//    private void initialize(Bundle _savedInstanceState) {
////        linear = (LinearLayout) findViewById(R.id.linear);
////        logo = (ImageView) findViewById(R.id.logo);
//        fullname = (EditText) findViewById(R.id.fullname);
//        idno = (EditText) findViewById(R.id.idno);
//        year = (EditText) findViewById(R.id.year);
//        section = (EditText) findViewById(R.id.section);
//        password = (EditText) findViewById(R.id.password);
//        signup_btn = (Button) findViewById(R.id.signup_btn);
//        signin_page = (TextView) findViewById(R.id.signin_page);

//        file = getSharedPreferences("data", Activity.MODE_PRIVATE);
//
//        linear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        signup_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                file.edit().putString("fullname", fullname.getText().toString()).commit();
//                file.edit().putString("idno", idno.getText().toString()).commit();
//                file.edit().putString("year", year.getText().toString()).commit();
//                file.edit().putString("section", section.getText().toString()).commit();
//                file.edit().putString("passoword", password.getText().toString()).commit();
//                SketchwareUtil.showMessage(getApplicationContext(), "Successfully Registered");
//            }
//        });
//
//        signin_page.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                in.setClass(getApplicationContext(), MainActivity.class);
//                startActivity(in);
//            }
//        });

    }
//    private void initializeLogic() {
//    }
//
//    @Override
//    protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
//        super.onActivityResult(_requestCode, _resultCode, _data);
//
//        switch (_requestCode) {
//
//            default:
//                break;
//        }
//    }
//
//    @Deprecated
//    public void showMessage(String _s) {
//        Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
//    }
//
//    @Deprecated
//    public int getLocationX(View _v) {
//        int _location[] = new int[2];
//        _v.getLocationInWindow(_location);
//        return _location[0];
//    }
//
//    @Deprecated
//    public int getLocationY(View _v) {
//        int _location[] = new int[2];
//        _v.getLocationInWindow(_location);
//        return _location[1];
//    }
//
//    @Deprecated
//    public int getRandom(int _min, int _max) {
//        Random random = new Random();
//        return random.nextInt(_max - _min + 1) + _min;
//    }
//
//    @Deprecated
//    public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
//        ArrayList<Double> _result = new ArrayList<Double>();
//        SparseBooleanArray _arr = _list.getCheckedItemPositions();
//        for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
//            if (_arr.valueAt(_iIdx))
//                _result.add((double)_arr.keyAt(_iIdx));
//        }
//        return _result;
//    }
//
//    @Deprecated
//    public float getDip(int _input){
//        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
//    }
//
//    @Deprecated
//    public int getDisplayWidthPixels(){
//        return getResources().getDisplayMetrics().widthPixels;
//    }
//
//    @Deprecated
//    public int getDisplayHeightPixels(){
//        return getResources().getDisplayMetrics().heightPixels;
//    }
//
//    public void signupp(View view) {
//        Intent intent = new Intent(Signup.this, MainActivity.class);
//        startActivity(intent);
//    }
//}


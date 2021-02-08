package com.example.hipo;

import androidx.appcompat.app.ActionBar;
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

public class MainActivity extends AppCompatActivity {

//    private LinearLayout linear1;
//    private ImageView logo1;
//    private EditText idno;
//    private EditText password;
//    private Button signin_btn;
//    private TextView signup_page;
//
//private Intent intent = new Intent();
//
//private SharedPreferences file;

    private EditText username , password;
    private Button signin_btn;
    private TextView signup_page;
    private DataBaseHelper myDb;

    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signin_btn = findViewById(R.id.signin_btn);
        signup_page = findViewById(R.id.signup_page);
        myDb = new DataBaseHelper(this);

        loginUser();
        signup_page();
    }

//    private void loginUser(){
//        signin_btn.setOnClickListener(v -> {
//            boolean var = myDb.checkUser(username.getText().toString() , password.getText().toString());
//            if (var){
//                Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(MainActivity.this , Profile.class));
//                finish();
//            }else{
//                Toast.makeText(MainActivity.this, "Login Failed !!", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

    private void loginUser(){
        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean var = myDb.checkUser(username.getText().toString() , password.getText().toString());
                if (var){
                    Toast.makeText(MainActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this , navigations.class));
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "Login Failed !!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private void signup_page(){
        signup_page.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this , Signup.class));
            finish();
        });
    }




//    private void initialize(Bundle _savedInstanceState) {
//        linear1 = (LinearLayout) findViewById(R.id.linear1);
//        logo1 = (ImageView) findViewById(R.id.logo1);
//        idno1 = (EditText) findViewById(R.id.idno1);
//        password1 = (EditText) findViewById(R.id.password1);
//        signin_btn = (Button) findViewById(R.id.signin_btn);
//        signup_page = (TextView) findViewById(R.id.signup_page);
//
//        file = getSharedPreferences("data", Activity.MODE_PRIVATE);

//    signin_btn.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//        if (idno1.getText().toString().equals(file.getString("idno", ""))){
//            if (password1.getText().toString().equals(file.getString("password", ""))) {
//                intent.setClass(getApplicationContext(), Profile.class);
//                startActivity(intent);
//
//            }
//
//                else{
//                    SketchwareUtil.showMessage(getApplicationContext(), "Invalid ID number or Password");
//                }
//            }
//            else {
//                SketchwareUtil.showMessage(getApplicationContext(), "Invalid ID number or Password");
//        }
//        }
//    });
//
//    signup_page.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            intent.setClass(getApplicationContext(), Signup.class);
//            startActivity(intent);
//        }
//    });
//
//    }
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

}

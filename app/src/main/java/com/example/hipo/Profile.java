package com.example.hipo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Profile extends AppCompatActivity {

    private LinearLayout linear2;
    private TextView profile;
    private LinearLayout linear3;

    private Button upload;
    private LinearLayout linear4;
    private TextView idno2;
    private TextView idno2_profile;
    private LinearLayout linear5;
    private TextView fullname1;
    private TextView fullname1_profile;
    private LinearLayout linear6;
    private TextView year1;
    private TextView year1_profile;
    private LinearLayout linear7;
    private TextView section1;
    private TextView section1_profile;
    private Button logout_btn;
    private DataBaseHelper myDb;

    private Intent intent = new Intent();

private SharedPreferences file;
    @Override
    protected void onCreate(Bundle _savedInstanceState) {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.activity_profile);
//        initialize(_savedInstanceState);
//        initializeLogic();
        DataBaseHelper dataBaseHelper = new DataBaseHelper(this);
        linear2 = (LinearLayout) findViewById(R.id.linear2);
        profile = (TextView) findViewById(R.id.profile);
        linear3 = (LinearLayout) findViewById(R.id.linear3);

        upload = (Button) findViewById(R.id.upload);
        linear4 = (LinearLayout) findViewById(R.id.linear4);
        idno2 = (TextView) findViewById(R.id.idno2);
        idno2_profile = (TextView) findViewById(R.id.idno2_profile);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        fullname1 = (TextView) findViewById(R.id.fullname1);
        fullname1_profile = (TextView) findViewById(R.id.fullname1_profile);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        year1 = (TextView) findViewById(R.id.year1);
        year1_profile = (TextView) findViewById(R.id.year1_profile);
        linear7 = (LinearLayout) findViewById(R.id.linear7);
        section1 = (TextView) findViewById(R.id.section1);
        section1_profile = (TextView) findViewById(R.id.section1_profile);
        logout_btn = (Button) findViewById(R.id.logout_btn);
//        Cursor cursor = dataBaseHelper.alldata();
//        StringBuilder stringBuilder = new StringBuilder();
//        StringBuilder stringBuilder2 = new StringBuilder();
//        StringBuilder stringBuilder3 = new StringBuilder();
//        StringBuilder stringBuilder4 = new StringBuilder();
//        while (cursor.moveToFirst()){
//            stringBuilder.append(cursor.getString(1));
//            stringBuilder2.append(cursor.getString(2));
//            stringBuilder3.append(cursor.getString(3));
//            stringBuilder4.append(cursor.getString(4));
//
//            fullname1_profile.setText(stringBuilder);
//            idno2_profile.setText(stringBuilder2);
//            year1_profile.setText(stringBuilder3);
//            section1_profile.setText(stringBuilder4);

        Cursor res = dataBaseHelper.alldata();
        if(res.getCount()==0){
            Toast.makeText(Profile.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
            return;
        }
        StringBuffer buffer = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer();
        StringBuffer buffer3 = new StringBuffer();
        StringBuffer buffer4 = new StringBuffer();
        while(res.moveToNext()){
            buffer.append(res.getString(1));
            buffer2.append(res.getString(2));
            buffer3.append(res.getString(3));
            buffer4.append(res.getString(4));
        }
              fullname1_profile.setText(buffer);
           idno2_profile.setText(buffer2);
            year1_profile.setText(buffer3);
           section1_profile.setText(buffer4);


            // idno2_profile.setText(res.getString(2));
//       fullname1_profile.setText(res.getString(3));
//        year1_profile.setText(res.getString(4));
//        section1_profile.setText(res.getString(5));
//        }
    }

//    private void initialize(Bundle _savedInstanceState) {
//        linear2 = (LinearLayout) findViewById(R.id.linear2);
//        profile = (TextView) findViewById(R.id.profile);
//        linear3 = (LinearLayout) findViewById(R.id.linear3);
//
//        upload = (Button) findViewById(R.id.upload);
//        linear4 = (LinearLayout) findViewById(R.id.linear4);
//        idno2 = (TextView) findViewById(R.id.idno2);
//        idno2_profile = (TextView) findViewById(R.id.idno2_profile);
//        linear5 = (LinearLayout) findViewById(R.id.linear5);
//        fullname1 = (TextView) findViewById(R.id.fullname1);
//        fullname1_profile = (TextView) findViewById(R.id.fullname1_profile);
//        linear6 = (LinearLayout) findViewById(R.id.linear6);
//        year1 = (TextView) findViewById(R.id.year1);
//        year1_profile = (TextView) findViewById(R.id.year1_profile);
//        linear7 = (LinearLayout) findViewById(R.id.linear7);
//        section1 = (TextView) findViewById(R.id.section1);
//        section1_profile = (TextView) findViewById(R.id.section1_profile);
//        logout_btn = (Button) findViewById(R.id.logout_btn);
//
//        file = getSharedPreferences("data", Activity.MODE_PRIVATE);
//
//        logout_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                intent.setClass(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
//            }
//        });
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
//    public void onStart() {
//        super.onStart();
//        Cursor res = myDb.alldata();
//        idno2_profile.setText(res.getString(2));
//       fullname1_profile.setText(res.getString(3));
//        year1_profile.setText(res.getString(4));
//        section1_profile.setText(res.getString(5));
////       if (res.getCount() == 0) {
////            Toast.makeText(Profile.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
////            return;
////        }
////        StringBuffer buffer = new StringBuffer();
////        while (res.moveToNext()) {
////            buffer.append("Name :" + res.getString(0) + "\n");
////            buffer.append("Contact :" + res.getString(1) + "\n");
////            buffer.append("Date of Birth :" + res.getString(2) + "\n\n");
//        }
//
//    @Override
//    public void onStart() {
//        super.onStart();
//        idno2_profile.setText(file.getString("USERNAME", ""));
//        fullname1_profile.setText(file.getString("FULLNAME", ""));
//        year1_profile.setText(file.getString("YEAR", ""));
//        section1_profile.setText(file.getString("SECTION", ""));
//    }
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


package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PhoneNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
            actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
    }
}
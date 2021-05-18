package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class OTPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
            actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
    }
}
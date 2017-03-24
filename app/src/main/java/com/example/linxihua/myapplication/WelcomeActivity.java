package com.example.linxihua.myapplication;

import android.app.Activity;
import android.os.Bundle;

import java.util.Date;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Date date = new Date();
        
    }
}

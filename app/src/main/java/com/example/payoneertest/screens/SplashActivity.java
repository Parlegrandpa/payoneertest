package com.example.payoneertest.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.window.SplashScreen;

import com.example.payoneertest.R;
import com.example.payoneertest.network.NetworkService;
import com.example.payoneertest.response.Applicable;
import com.example.payoneertest.response.FetchDataResponse;
import com.example.payoneertest.response.Networks;

import java.util.List;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

                new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 1000);
    }
}
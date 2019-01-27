package com.entralltechtask.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.entralltechtask.R;
import com.entralltechtask.Util.JWTUtils;
import com.entralltechtask.Util.PrefUtils;

public class SplashActivity extends AppCompatActivity
{

    int SPLASH_TIME_OUT = 1500;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        openScreens();
    }

    private void openScreens()
    {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (PrefUtils.getToken(SplashActivity.this).length() > 0) {
                    try {
                        JWTUtils.decoded(PrefUtils.getToken(SplashActivity.this));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                } else {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        }, SPLASH_TIME_OUT);
    }

}

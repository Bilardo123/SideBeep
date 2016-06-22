package com.example.user.sidebeep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        setView();
    }

    public void setView()
    {
        try {
            Thread.sleep(10000);
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        } catch (InterruptedException e) {
            Log.e("Splash Screen Activity", e.toString());
        }
    }
}

package com.coolweather.android.coolweather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.coolweather.android.R;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }
}

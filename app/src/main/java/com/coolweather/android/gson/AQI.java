package com.coolweather.android.gson;

/**
 * Created by Administrator on 2018/1/26 0026.
 */
public class AQI {
    public AQICity city;

    public class AQICity{
        public String api;
        public String pm25;
    }
}

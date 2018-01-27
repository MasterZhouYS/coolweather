package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/1/26 0026.
 */
public class Suggestion {
    @SerializedName("comf")
    public Confort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Confort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
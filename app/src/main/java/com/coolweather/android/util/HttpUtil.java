package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/1/26 0026.
 */
public class HttpUtil {

    /**
     * 发送服务器请求
     * @param address   请求地址
     * @param callback  回调接口
     */
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

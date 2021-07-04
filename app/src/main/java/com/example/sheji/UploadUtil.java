package com.example.sheji;
import android.os.Build;
import androidx.annotation.RequiresApi;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.*;

import java.io.IOException;
import java.net.URLEncoder;

import java.util.concurrent.TimeUnit;

//@Component
public class UploadUtil {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static JSONObject uploadFile(String img, String path) throws IOException {
        img = URLEncoder.encode(img, "UTF-8");
        String json = "{\"data\":" + "\"" + img + "\"}";

        RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
        okhttp3.Request request = new okhttp3.Request.Builder().url(path).post(body).build();
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .readTimeout(100, TimeUnit.SECONDS)
                .writeTimeout(100, TimeUnit.SECONDS).build();
        Response response = null;
        try {
            response = okHttpClient.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (response.isSuccessful()) {
            JSONObject obj = null;
            try {
                obj = new JSONObject(response.body().string());
                return obj;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return obj;

        } else {
            JSONObject obj = null;
            try {
                obj = new JSONObject("{\"img\":" + ",\"score\":3}");
                return obj;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return obj;
        }
    }

}
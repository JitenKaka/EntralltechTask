package com.entralltechtask.Util;

import android.util.Base64;
import android.util.Log;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class JWTUtils {

    public static void decoded(String JWTEncoded) throws Exception {
        try {
            String[] split = JWTEncoded.split("\\.");
            Log.d("JWT_DECODED", "Header: " + getJson(split[0]));
            Log.d("JWT_DECODED", "Body: " + getJson(split[1]));

            JSONObject jsonObject = new JSONObject(getJson(split[1]));
            JSONObject userObject = jsonObject.getJSONObject("data");
         //   Globals.user = new User(userObject);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private static String getJson(String strEncoded) throws UnsupportedEncodingException {
        byte[] decodedBytes = Base64.decode(strEncoded, Base64.URL_SAFE);
        return new String(decodedBytes, "UTF-8");
    }
}
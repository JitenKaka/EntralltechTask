package com.entralltechtask.Util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefUtils {

    public static final String PREFS_LOGIN_USERNAME_KEY = "__USERNAME__";
    public static final String PREFS_USER_TOKEN_KEY = "_TOKEN_ID_";



    public static void saveToLoginPrefs(Context context, String userName, String token) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        final SharedPreferences.Editor editor = prefs.edit();
        editor.putString(PREFS_LOGIN_USERNAME_KEY, userName);
        editor.putString(PREFS_USER_TOKEN_KEY, token);
        editor.apply();
    }

    public static boolean isLogin(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        String username = prefs.getString(PREFS_LOGIN_USERNAME_KEY, "");
//        String userPassword = prefs.getString(PREFS_LOGIN_PASSWORD_KEY, "");
        return username.length() > 0;
    }

    public static String getUserName(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(PREFS_LOGIN_USERNAME_KEY, "");
    }

    public static String getToken(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(PREFS_USER_TOKEN_KEY, "");
    }

}
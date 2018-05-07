package com.avidek.avidek;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 * Created by Davit Avetisyan on 5/7/18.
 * Copyright © 2018 Davit Avetisyan. All rights reserved.
 */

public class SharedPreference {
    Context context;
    SharedPreferences prefs;
    SharedPreferences.Editor editor;
    public final String SHARED_PREF = "ShiftChat";

    // local variables
    public static String FIRE_BASE_TOKEN = "FIRE_BASE_TOKEN";
    public static String PHONE_NUMBER = "PHONE_NUMBER";
    public static String CURRENT_SHIFT = "CURRENT_SHIFT";
    public static String USER_ACCOUNT = "USER_ACCOUNT";
    public static String USER_ID = "USER_ID";
    public static String USER_TOKEN = "USER_TOKEN";
    public static String LAST_LOCATION = "LAST_LOCATION";

    public static String SETTINGS_LOCATION_DISTANCE = "SETTINGS_LOCATION_DISTANCE";
    public static String SETTINGS_TIME_DISTANCE = "SETTINGS_TIME_DISTANCE";
    public static String SEND_LOCATION_TOGGLE = "SEND_LOCATION_TOGGLE";

    // notification part constants
    public static String LUNCH_INFO = "LUNCH_INFO";
    public static String LUNCH_CLOCKOUT_TIME = "LUNCH_CLOCKOUT_TIME";
    public static String IS_LUNCH_CLOCKOUT = "IS_LUNCH_CLOCKOUT";
    public static String IS_NOTIFICATIONS_SET_UP = "IS_NOTIFICATIONS_SET_UP";


    public void testLib() {
        Log.d("davit", "avidek");
    }


    public SharedPreference(Context context) {
        this.context = context;
        prefs = context.getSharedPreferences(SHARED_PREF, context.MODE_PRIVATE);
        editor = context.getSharedPreferences(SHARED_PREF, context.MODE_PRIVATE).edit();
    }

    public SharedPreferences getPrefs() {
        return prefs;
    }

    public String getValueString(String key) {
        String value = prefs.getString(key, null);
        return value;
    }

    public void setValueString(String key, String value) {
        editor.putString(key, value).apply();
    }


    public void setValueLong(String key, Long value) {
        editor.putLong(key, value).apply();
    }


    public Long getValueLong(String key) {
        Long value = prefs.getLong(key, 0);
        return value;
    }

    public void setValueBoolean(String key, boolean value) {
        editor.putBoolean(key, value).apply();
        Log.d("sharedPreference", key + " " + value);
    }

    public boolean getValueBoolean(String key) {
        boolean value = prefs.getBoolean(key, false);
        return value;
    }

}

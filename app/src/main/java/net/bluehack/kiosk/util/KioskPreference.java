package net.bluehack.kiosk.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.gson.Gson;

import net.bluehack.kiosk.model.LoginResDataItem;

public class KioskPreference {

    private Context context;

    public static final String LOGIN_INFO = "pref_login_info";

    private static class SingletonHolder {
        static final KioskPreference INSTANCE = new KioskPreference();
    }

    public static KioskPreference getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void init(Context context) {
        this.context = context;
    }

    public String getLoginInfo() {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getString(LOGIN_INFO, null);
    }

    public void setLoginInfo(String loginResDataItem) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        Log.e("preference: ", loginResDataItem);
        sp.edit().putString(LOGIN_INFO, loginResDataItem).apply();
    }
}

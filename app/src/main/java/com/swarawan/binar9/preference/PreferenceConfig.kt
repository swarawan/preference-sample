package com.swarawan.binar9.preference

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

/**
 * Created by Rio Swarawan on 10/15/18.
 */
class PreferenceConfig(context: Context) {

    private var preferences: SharedPreferences =
            context.getSharedPreferences("binar-batch9-preferences", Context.MODE_PRIVATE)

    fun setString(key: String, value: String) {
        val editor = preferences.edit()
        editor.putString(key, value)
        editor.apply()
    }

    fun setBoolean(key: String, value: Boolean) {
        val editor = preferences.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    fun getString(key: String): String {
        return preferences.getString(key, "")
    }

    fun getBoolean(key: String): Boolean {
        return preferences.getBoolean(key, false)
    }
}
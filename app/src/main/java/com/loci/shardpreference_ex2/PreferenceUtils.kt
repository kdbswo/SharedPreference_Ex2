package com.loci.shardpreference_ex2

import android.content.Context

class PreferenceUtils(context: Context) {
    private val sharedPreferences =
        context.getSharedPreferences("sharedPreference", Context.MODE_PRIVATE)

    fun putStr(key: String, value: String) {
        with(sharedPreferences.edit()) {
            putString(key, value)
            apply()
        }
    }

    fun getStr(key: String): String? {
        return sharedPreferences.getString(key, "defaultStr")
    }

    fun putBool(key: String, value: Boolean) {
        with(sharedPreferences.edit()) {
            putBoolean(key, value)
            apply()
        }
    }

    fun getBool(key: String): Boolean {
        return sharedPreferences.getBoolean(key, false)
    }
}
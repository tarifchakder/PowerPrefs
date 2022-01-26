package com.tarif.powerprefs

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager
import com.tarif.powerprefs.ContextProvider.appContext
import com.tarif.powerprefs.PowerPref.init
import com.tarif.powerprefs.tools.SingletonHolder


/**
 * @Author: Tarif Chakder
 * @Date: 26-01-2022
 */

object PowerPref : SingletonHolder<SharedPreferences, Context>({ init(it.applicationContext) }) {

    fun init(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    fun SharedPreferences.save(key: String, value: Any) {
        when(value) {
            is Boolean -> edit { putBoolean(key, value) }
            is Int -> edit { putInt(key, value) }
            is Float -> edit { putFloat(key, value) }
            is Long -> edit { putLong(key, value) }
            is String -> edit { putString(key, value) }
            is List<*> -> edit { putStringSet(key, value.toSet() as Set<String>) }
            else -> throw IllegalArgumentException("value class is invalid!")
        }
    }

    var powerPref = init(appContext)
}

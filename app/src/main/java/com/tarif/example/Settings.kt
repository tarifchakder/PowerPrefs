package com.tarif.example

import android.content.Context
import com.tarif.powerprefs.PowerPref
import com.tarif.powerprefs.PowerPref.save

/**
 * @Author: Tarif Chakder
 * @Date: 26-01-2022
 */
class Settings(context: Context) {

    private val pref = PowerPref.getInstance(context)

    var time: Long
        get() = pref.getLong("date", System.currentTimeMillis())
        set(value) = pref.save("date", value)


}
package com.tarif.example

import com.tarif.powerprefs.tools.ContextProvider
import com.tarif.powerprefs.PowerPref
import com.tarif.powerprefs.PowerPref.save

/**
 * @Author: Tarif Chakder
 * @Date: 26-01-2022
 */

object Settings {

    private val pref = PowerPref.getInstance(ContextProvider.appContext)

    var helloPowerPref: String
        get() = pref.getString("key", "Hello PowerPref !!") ?: "Hello PowerPref !!"
        set(value) = pref.save("key", value)

    var time: Long
        get() = pref.getLong("time", System.currentTimeMillis())
        set(value) = pref.save("time", value)


}
package com.tarif.powerprefs

import androidx.appcompat.app.AppCompatActivity

/**
 * @Author: Tarif Chakder
 * @Date: 26-01-2022
 */


val AppCompatActivity.pref
    get() = PowerPref.init(applicationContext)


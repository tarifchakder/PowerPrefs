package com.tarif.example

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tarif.powerprefs.PowerPref
import com.tarif.powerprefs.PowerPref.powerPref
import com.tarif.powerprefs.PowerPref.pref
import com.tarif.powerprefs.PowerPref.save
import com.tarif.powerprefs.pref

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        powerPref.getString("KEY","Tarif")

        powerPref.getString("KEY","Tarif")?.let { Log.d("Tarif", it) }

        Handler(Looper.getMainLooper()).postDelayed({
            powerPref.save("KEY","cHAKDER")
            powerPref.getString("KEY","Tarif")?.let { Log.d("Tarif", it) }
        },1000)



    }
}

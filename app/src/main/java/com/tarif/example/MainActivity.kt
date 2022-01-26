package com.tarif.example

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tarif.example.Settings.helloPowerPref
import com.tarif.example.Settings.time
import com.tarif.example.databinding.ActivityMainBinding
import com.tarif.powerprefs.PowerPref
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var bind : ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)


        bind.txt.text = convertTimeFormat(time) + "  "+ helloPowerPref

        bind.btn.setOnClickListener {
            time = System.currentTimeMillis()
            helloPowerPref = "Successfully saved "
            bind.txt.text = convertTimeFormat(time) + "  "+ helloPowerPref

        }

    }

    @SuppressLint("SimpleDateFormat")
    private fun convertTimeFormat(millSec: Long): String {
        val timeD = Date(millSec * 1000)
        val sdf = SimpleDateFormat("HH:mm:ss")
        return sdf.format(timeD)
    }
}

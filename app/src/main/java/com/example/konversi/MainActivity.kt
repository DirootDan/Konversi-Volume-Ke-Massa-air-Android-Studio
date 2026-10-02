package com.example.konversi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etVolume = findViewById<EditText>(R.id.et_volume)
        val btnHitung = findViewById<Button>(R.id.btn_hitung)
        val tvHasil = findViewById<TextView>(R.id.tv_hasil)

        btnHitung.setOnClickListener {
            val volumeStr = etVolume.text.toString()
            if (volumeStr.isNotEmpty()) {
                val volume = volumeStr.toDouble()
                // Massa jenis air murni = 1 kg/L. Massa = Volume * Massa Jenis
                val massa = volume * 1.0
                tvHasil.text = "$massa kg"
            } else {
                etVolume.error = "Volume tidak boleh kosong"
            }
        }
    }
}
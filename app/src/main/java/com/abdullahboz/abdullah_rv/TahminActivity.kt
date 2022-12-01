package com.abdullahboz.abdullah_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdullahboz.abdullah_rv.databinding.ActivityTahminBinding

class TahminActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTahminBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTahminBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val tahmin = intent.getStringExtra("tahminsec")

        binding.textView2.setText(tahmin)
        //binding.textView2.setText(takim)


    }
}
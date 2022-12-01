package com.abdullahboz.abdullah_rv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abdullahboz.abdullah_rv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // viewBinding ile açılış ekranındaki butona basarak RecyclerActivity
        //Layoutumaza geçiş yapıyoruz.
       binding.apply {
           btnBasla.setOnClickListener{
               val intent = Intent(this@MainActivity,RecyclerActivity::class.java)
               startActivity(intent)
           }
       }
    }
}
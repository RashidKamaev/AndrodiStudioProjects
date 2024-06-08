package com.example.gameofyear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gameofyear.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var balance: Double = 0.0
    private var rate: Double = 2.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtRate.text = rate.toString()
        binding.btnClick.setOnClickListener {
            balance += rate
            binding.txtBalance.text = balance.toString()
        binding.shop.setOnClickListener{
            var iu = Intent(this, MainActivity2::class.java)
            startActivity(iu)
        }

        }
    }
}
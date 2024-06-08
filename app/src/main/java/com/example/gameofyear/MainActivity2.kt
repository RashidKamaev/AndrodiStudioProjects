package com.example.gameofyear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gameofyear.databinding.ActivityMain2Binding
import com.example.gameofyear.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            var iu = Intent(this, MainActivity::class.java)
            startActivity(iu)
        }
    }
}
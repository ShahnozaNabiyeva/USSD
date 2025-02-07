package com.shahnoza.ussd

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.shahnoza.ussd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDaqiqa.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","daqiqa")
            startActivity(intent)
        }
        binding.btnInternet.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","internet")
            startActivity(intent)
        }
        binding.btnSMS.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","sms")
            startActivity(intent)
        }
        binding.btnTariflar.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","tariflar")
            startActivity(intent)
        }
        binding.btnXizmatlar.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","xizmatlar")
            startActivity(intent)
        }
        binding.btnYangiliklar.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","yangiliklar")
            startActivity(intent)
        }
    }
}
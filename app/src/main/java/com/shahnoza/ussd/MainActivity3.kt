package com.shahnoza.ussd

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import com.shahnoza.ussd.MyObject
import com.shahnoza.ussd.databinding.ActivityMain3Binding

class MainActivity3: AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getSerializableExtra("key") as MyObject

        binding.txtName.text = data.name
        binding.txtCode.text = data.code
        binding.txtAbout.text = data.about

    }
}
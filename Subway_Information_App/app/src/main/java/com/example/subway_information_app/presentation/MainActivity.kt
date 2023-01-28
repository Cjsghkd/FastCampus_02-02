package com.example.subway_information_app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.subway_information_app.R
import com.example.subway_information_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
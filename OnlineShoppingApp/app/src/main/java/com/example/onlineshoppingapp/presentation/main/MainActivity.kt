package com.example.onlineshoppingapp.presentation.main

import android.os.Bundle
import com.example.onlineshoppingapp.databinding.ActivityMainBinding
import com.example.onlineshoppingapp.presentation.BaseActivity
import org.koin.android.ext.android.inject

internal class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override val viewModel: MainViewModel by inject<MainViewModel>()

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun observeData() {
    }
}
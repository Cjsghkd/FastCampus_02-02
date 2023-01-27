package com.example.onlineshoppingapp.presentation.main

import androidx.lifecycle.viewModelScope
import com.example.onlineshoppingapp.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class MainViewModel: BaseViewModel() {
    override fun fetchData(): Job = viewModelScope.launch {  }
}
package com.faris.guessinggame

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ResultVIewModelFactory(private val finalResult: String) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ResultViewModel::class.java)){
            return ResultViewModel(finalResult) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }

}
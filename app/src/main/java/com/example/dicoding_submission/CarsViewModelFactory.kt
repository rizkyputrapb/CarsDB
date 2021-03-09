package com.example.dicoding_submission

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class CarsViewModelFactory(private var carList: List<Cars>) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CarsViewModel::class.java)) {
            Log.d("ViewModelFactory", "ViewModelFactory diakses")
            return CarsViewModel(carList) as T
        }
        throw IllegalArgumentException("Viewmodel Yang Diminta CarsViewModel")
    }
}
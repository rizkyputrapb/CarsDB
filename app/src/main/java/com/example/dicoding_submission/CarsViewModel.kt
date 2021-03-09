package com.example.dicoding_submission

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CarsViewModel: ViewModel {
    var listMutableLiveData = MutableLiveData<List<Cars>>()
    var carList: List<Cars>? = null

    constructor(carList: List<Cars>?){
        this.carList = carList
        listMutableLiveData.value = carList!!
        Log.d("VMConst", "Constructor VM diakses")
    }

    fun listCarsLiveData(): LiveData<List<Cars>> {
        Log.d("listLiveData", "LiveData diakses")
        return listMutableLiveData
    }

    
}
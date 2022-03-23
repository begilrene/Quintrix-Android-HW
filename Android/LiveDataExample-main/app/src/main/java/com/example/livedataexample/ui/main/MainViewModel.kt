package com.example.livedataexample.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    private val usd_to_eu_rate = 0.74f

    private var A = 0
    private var B = 0
   // private var result: Float = 0f
    private  var result : MutableLiveData<Int> = MutableLiveData()
    //private var B : MutableLiveData<Int> = MutableLiveData()

    fun setAmount(a: Int, b: Int) {

        this.A = a
        this.B = b

        result.value = A * B

        //result = value.toFloat() * usd_to_eu_rate
       // result.setValue(value.toFloat()*usd_to_eu_rate)
    }



    //fun getResult(): Float? {

    fun getResult():MutableLiveData<Int>{
        return result

    }

}
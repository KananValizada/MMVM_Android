package com.example.mvvmusage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel:ViewModel() {
    var result = MutableLiveData("0")
    var mrepo = MathRepository()

    fun add(num1Result:String,num2Result:String){//side effect
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mrepo.add(num1Result,num2Result)
        }



//        val number1 = num1Result.toInt()
//        val number2 = num2Result.toInt()
//        val add = number1 + number2
//
//        result.value = add.toString() //value = trigger
    }

    fun multiple(num1Result:String,num2Result:String){//side effect
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mrepo.multiple(num1Result,num2Result)
        }

//        val number1 = num1Result.toInt()
//        val number2 = num2Result.toInt()
//        val multiple = number1 * number2
//
//        result.value = multiple.toString()
    }
}
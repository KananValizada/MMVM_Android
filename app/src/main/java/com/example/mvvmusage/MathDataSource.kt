package com.example.mvvmusage

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MathDataSource {
    suspend fun add(num1Result:String,num2Result:String) : String=
    withContext(Dispatchers.IO){//side effect
        val number1 = num1Result.toInt()
        val number2 = num2Result.toInt()
        val add = number1 + number2

        return@withContext add.toString() //value = trigger
    }

    suspend fun multiple(num1Result:String,num2Result:String) : String=
    withContext(Dispatchers.IO){//side effect
        val number1 = num1Result.toInt()
        val number2 = num2Result.toInt()
        val multiple = number1 * number2

        return@withContext multiple.toString()
    }
}
package com.example.mvvmusage

class MathRepository {
    var mds = MathDataSource()

    suspend fun add(num1Result:String,num2Result:String) : String = mds.add(num1Result,num2Result)


    suspend fun multiple(num1Result:String,num2Result:String) : String =  mds.multiple(num1Result,num2Result)
}
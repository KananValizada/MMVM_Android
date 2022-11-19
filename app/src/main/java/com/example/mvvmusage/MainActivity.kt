package com.example.mvvmusage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmusage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val viewModel:MainActivityViewModel by viewModels() // by  = delegate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding  = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivity = this


        viewModel.result.observe(this){
            binding.result = it
        }

    }

    fun add(num1Result:String,num2Result:String){
        viewModel.add(num1Result,num2Result)

    }

    fun multiple(num1Result:String,num2Result:String){
        viewModel.multiple(num1Result,num2Result)

    }

}
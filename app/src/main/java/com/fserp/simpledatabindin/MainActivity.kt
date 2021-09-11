package com.fserp.simpledatabindin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.fserp.simpledatabindin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui()
    }
    fun ui()
    {
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.students=getStudent()
    }

    fun getStudent():Students{
        return Students("naimuddin","naimuddin@gmail.com")
    }
}
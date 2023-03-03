package com.example.myservice

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myservice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent= Intent(this,MyService::class.java)


        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)
        {
            startForegroundService(intent )

        }else{
            startService(intent)
        }
    }
}
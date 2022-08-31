package com.example.multithreading.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multithreading.databinding.ActivityMainBinding
import com.example.multithreading.ui.threads.Thread1
import com.example.multithreading.ui.threads.Thread2

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.v("testThread", Thread.currentThread().name)

        // method 1 to create thread -->

        val thread1= Thread1()
        thread1.start()

        // method 2 to create thread -->
        val thread2 = Thread( Thread2() )
        thread2.start()

        // method 3 to create thread -->
        val thread3 = Thread {
            Log.v("testThread", Thread.currentThread().name)
        }.start()

    }
}
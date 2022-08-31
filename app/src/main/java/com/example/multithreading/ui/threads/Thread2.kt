package com.example.multithreading.ui.threads

import android.util.Log

class Thread2: Runnable {
    override fun run() {
        // do something here
        Log.v("testThread", Thread.currentThread().name)
    }
}
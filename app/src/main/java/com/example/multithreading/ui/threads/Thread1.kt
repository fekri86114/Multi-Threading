package com.example.multithreading.ui.threads

import android.util.Log

class Thread1: Thread() {

    override fun run() {
        super.run()
        // do something here

        Log.v("testThread", Thread.currentThread().name)

    }

}
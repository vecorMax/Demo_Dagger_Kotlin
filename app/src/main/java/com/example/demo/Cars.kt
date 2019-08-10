package com.example.demo

import android.util.Log
import javax.inject.Inject

class Cars @Inject
constructor(engine:Engine, wheels:Wheels)
{
    private val engine:Engine
    private val wheels:Wheels

    init{
        this.engine = engine
        this.wheels = wheels
    }

    fun drive() {
        Log.d(TAG, "drive")
    }

    companion object {
        private val TAG = "Car"
    }
}
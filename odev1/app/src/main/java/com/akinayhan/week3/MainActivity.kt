package com.akinayhan.week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Log.v("TEST","onCreate called.")
    }
    /*
    override fun onStart() {
        super.onStart()
        Log.v("TEST","onStart called.")
    }

    override fun onResume() {
        super.onResume()
        Log.v("TEST","onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.v("TEST","onPause called")
    }

    override fun onStop() {
        super.onStop()
        Log.v("TEST", "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.v("TEST","onRestart called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.v("TEST","onDestroy called")
    }
     */

}
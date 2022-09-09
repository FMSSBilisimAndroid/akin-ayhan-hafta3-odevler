package com.patika.week3appnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    /*
    geri tuşuna iki kere üst üste tıklarsak uygulamadan tamamen çıkar.
     */

    var backPressedTime: Long = 0

    override fun onBackPressed() {
        if (backPressedTime + 5000 > System.currentTimeMillis()) {
            super.onBackPressed()
            finishAffinity()
        } else {
            Toast.makeText(this, "Uygulamadan çıkmak için tekrar basın.", Toast.LENGTH_LONG).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}
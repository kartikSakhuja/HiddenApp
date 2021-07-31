package com.amai.ar.hiddenapp

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    var clickcount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startService(Intent(this, NewService::class.java))

    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        clickcount=clickcount+1;
        if(clickcount==3)
        {
            stopService(Intent(this, NewService::class.java))

            startActivity(Intent(this@MainActivity, MainActivity2::class.java))
        }
        return true
    }
}
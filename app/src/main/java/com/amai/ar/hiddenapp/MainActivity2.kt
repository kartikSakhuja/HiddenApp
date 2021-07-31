package com.amai.ar.hiddenapp

import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    var clickcount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {

            if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
                clickcount=clickcount+1;
                if(clickcount==3)
                {
                   finish()
                }

        }
            return true
    }
}
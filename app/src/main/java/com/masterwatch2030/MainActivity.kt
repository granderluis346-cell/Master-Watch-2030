package com.masterwatch2030

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val title = TextView(this)
        title.text = "MASTER WATCH 2030"
        title.textSize = 28f
        title.setPadding(32, 64, 32, 32)

        setContentView(title)
    }
}
package com.goobar.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {

    var clickHandler: (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button).apply {
            text = "Hello Kotlin"
            gravity = Gravity.START
            setTextColor(resources.getColor(R.color.colorAccent))
        }

        button.setOnClickListener {
            // handle the event
            clickHandler?.invoke()
        }
    }
}

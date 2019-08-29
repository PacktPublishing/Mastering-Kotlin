package com.packt.androidmultiplatform

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import Presenter
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var title: TextView
    lateinit var subtitle: TextView
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = findViewById(R.id.titleText)
        subtitle = findViewById(R.id.subtitleText)
        button = findViewById(R.id.button)

        val presenter = Presenter().apply {
            viewStateListener = {
                title.text = it.title
                subtitle.text = it.subtitle
            }
        }

        button.setOnClickListener { presenter.onClick() }
    }
}

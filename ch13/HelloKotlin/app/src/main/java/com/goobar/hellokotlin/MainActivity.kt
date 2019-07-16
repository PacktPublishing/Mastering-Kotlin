package com.goobar.hellokotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import androidx.core.content.edit
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.commit
import androidx.fragment.app.transaction
import kotlinx.android.synthetic.main.activity_main.button as theButton

class MainActivity : AppCompatActivity() {

    var clickHandler: (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        theButton.apply {
            text = "Hello Kotlin"
            gravity = Gravity.START
            setTextColor(resources.getColor(R.color.colorAccent))
        }

        theButton.setOnClickListener {
            // handle the event
            clickHandler?.invoke()
        }

        val preferences = getPreferences(Context.MODE_PRIVATE)
        preferences.edit {
            putBoolean("key", false)
            putString("key2", "value")
        }

        theButton.doOnPreDraw {
            // Perform an action when view is about to be drawn
        }

        supportFragmentManager.commit {
            addToBackStack("fragment name")
            add(SampleFragment(), "tag")
            setCustomAnimations(R.anim.abc_fade_in, R.anim.abc_fade_out)
        }
    }
}

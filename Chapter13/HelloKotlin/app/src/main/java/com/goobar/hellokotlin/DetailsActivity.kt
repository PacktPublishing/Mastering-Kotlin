package com.goobar.hellokotlin

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun Context.createDetailsIntent(id: String) =
    Intent(this, DetailsActivity::class.java).apply {
        putExtra(DetailsActivity.EXTRA_ID, id)
    }

class DetailsActivity : AppCompatActivity() {

    companion object Factory {
        const val EXTRA_ID = "extra_id"

        @JvmStatic
        fun createIntent(context: Context, id: String) =
            Intent(context, DetailsActivity::class.java).apply {
                putExtra(EXTRA_ID, id)
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        savedInstanceState?.let { it }
    }

    fun restoreSavedState(savedInstanceState: Bundle) {
        // restore state
    }
}

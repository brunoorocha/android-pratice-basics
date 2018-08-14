package com.example.brunoorocha.basicactivitiesintents

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)

        val messageTextView = findViewById<TextView>(R.id.messageTextView).apply({
            text = message
        })
    }
}

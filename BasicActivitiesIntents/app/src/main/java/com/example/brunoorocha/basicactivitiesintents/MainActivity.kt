package com.example.brunoorocha.basicactivitiesintents

import android.app.SearchManager
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.view.*

const val EXTRA_MESSAGE = "com.example.basicactivitesintents.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun didTappedOnGoogleSearchButton(button: View) {
        val queryEditText = findViewById<EditText>(R.id.queryEditText)
        val query= queryEditText.text.toString()

        searchOnGoogle(query)
    }

    fun didTappedOnNextActivityButton(button: View) {
        val messageEditText = findViewById<EditText>(R.id.queryEditText)
        val message= messageEditText.text.toString()

        callNextActivityWithMessage(message)
    }

    fun searchOnGoogle(query: String) {
        val intent = Intent(Intent.ACTION_WEB_SEARCH)
        intent.putExtra(SearchManager.QUERY, query)

        if(intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    fun callNextActivityWithMessage(message: String) {
        val intent = Intent(this, ShowMessageActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)

        startActivity(intent)
    }

}

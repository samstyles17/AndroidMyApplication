package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val username = intent.getStringExtra("USERNAME_EXTRA")
        if (username != null) {
            supportActionBar?.title = ""
            val titleTextView: TextView = findViewById(R.id.titleTextView)
            titleTextView.text = getString(R.string.app_name)
            val subtitleTextView: TextView = findViewById(R.id.subtitleTextView)
            subtitleTextView.text = "Welcome, $username!"
        }
    }
    // b1 is clicked
    fun b1(view: View?) {
        val facebookUrl = "https://www.facebook.com/Infosys/"
        openWebsite(facebookUrl)
    }

    // b2 is clicked
    fun b2(view: View?) {
        val linkedinUrl = "https://www.linkedin.com/company/infosys/?originalSubdomain=in"
        openWebsite(linkedinUrl)
    }

    // b3 is clicked
    fun b3(view: View?) {
        val facebookUrl = "https://www.facebook.com/goldmansachs/"
        openWebsite(facebookUrl)
    }

    // b4 is clicked
    fun b4(view: View?) {
        val linkedinUrl = "https://www.linkedin.com/company/goldman-sachs/"
        openWebsite(linkedinUrl)
    }

    // Helper method to open a website URL
    private fun openWebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}

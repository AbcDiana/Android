package com.abcdiane.motormaticmurah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class ProfileActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "About"
        }

        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        val tvName: TextView = findViewById(R.id.tv_profile_name)
        tvName.text = name

        val tvEmail: TextView = findViewById(R.id.tv_profile_email)
        tvEmail.text = email
    }
}

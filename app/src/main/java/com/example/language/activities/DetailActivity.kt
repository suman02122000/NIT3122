package com.example.language.activities

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.language.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Retrieve the data passed from the DashboardActivity
        val name = intent.getStringExtra("name")
        val family = intent.getStringExtra("family")
        val branch = intent.getStringExtra("branch")
        val speakers = intent.getStringExtra("speakers")
        val writingSystem = intent.getStringExtra("writingSystem")
        val officialIn = intent.getStringExtra("officialIn")
        val description = intent.getStringExtra("description")

        // Set the retrieved data into views
        findViewById<TextView>(R.id.languageName).text = name
        findViewById<TextView>(R.id.family).text = family
        findViewById<TextView>(R.id.branch).text = branch
        findViewById<TextView>(R.id.speakers).text = speakers
        findViewById<TextView>(R.id.writingSystem).text = writingSystem
        findViewById<TextView>(R.id.officialIn).text = officialIn
        findViewById<TextView>(R.id.description).text = description
    }
}

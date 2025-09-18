package com.example.obye.Stories

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import android.content.Intent
import com.example.obye.home.HomeActivity
import android.widget.ImageView
import com.example.obye.Stories.StoriesCrystalActivity
import com.example.obye.Stories.StoriesGwilymActivity
import com.example.obye.Stories.StoriesBonnieActivity

class StoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories)

        val storiesView = findViewById<ImageView>(R.id.icbackStories)
        storiesView.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val crystalView = findViewById<ImageView>(R.id.crystalView)
        crystalView.setOnClickListener {
            val intent = Intent(this, StoriesCrystalActivity::class.java)
            startActivity(intent)
        }

        val gwilymView = findViewById<ImageView>(R.id.gwilymView)
        gwilymView.setOnClickListener {
            val intent = Intent(this, StoriesGwilymActivity::class.java)
            startActivity(intent)
        }

        val bonnieView = findViewById<ImageView>(R.id.bonnieView)
        bonnieView.setOnClickListener {
            val intent = Intent(this, StoriesBonnieActivity::class.java)
            startActivity(intent)
        }

    }
}

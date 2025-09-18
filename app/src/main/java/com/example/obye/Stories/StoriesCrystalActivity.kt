package com.example.obye.Stories

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import android.content.Intent
import com.example.obye.Stories.StoriesActivity
import android.widget.ImageView

class StoriesCrystalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories_crystal)

        val storiesView = findViewById<ImageView>(R.id.icbackstCrystal)
        storiesView.setOnClickListener {
            val intent = Intent(this, StoriesActivity::class.java)
            startActivity(intent)
        }

    }
}

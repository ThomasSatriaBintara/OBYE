package com.example.obye.Stories

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import android.content.Intent
import android.widget.ImageView

class StoriesBonnieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories_bonnie)

        val storiessView = findViewById<ImageView>(R.id.icbackstBonnie)
        storiessView.setOnClickListener {
            val intent = Intent(this, StoriesActivity::class.java)
            startActivity(intent)
        }

    }
}

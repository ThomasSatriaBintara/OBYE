package com.example.obye.Stories

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import android.content.Intent
import android.widget.ImageView

class StoriesGwilymActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stories_gwilym)

        val storiesView = findViewById<ImageView>(R.id.icbackstGwilym)
        storiesView.setOnClickListener {
            val intent = Intent(this, StoriesActivity::class.java)
            startActivity(intent)
        }

    }
}

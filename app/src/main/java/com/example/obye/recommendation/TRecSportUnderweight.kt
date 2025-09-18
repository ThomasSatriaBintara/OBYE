package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecSportUnderweight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_sport_underweight)

        val sportUd = findViewById<ImageView>(R.id.backrecsport)
        sportUd.setOnClickListener {
            val intent = Intent(this, RecFdsUnderweight::class.java)
            startActivity(intent)
        }

    }
}
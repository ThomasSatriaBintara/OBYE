package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecSportOverweight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_sport_overweight)

        val sportOv = findViewById<ImageView>(R.id.backrecsportov)
        sportOv.setOnClickListener {
            val intent = Intent(this, RecFdsOverweight::class.java)
            startActivity(intent)
        }

    }
}
package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecSportObesity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_sport_obesity)

        val sportOb = findViewById<ImageView>(R.id.backrecsportob)
        sportOb.setOnClickListener {
            val intent = Intent(this, RecFdsObesity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecSportNormal: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_sport_normal)

        val sportNm = findViewById<ImageView>(R.id.backrecsportnm)
        sportNm.setOnClickListener {
            val intent = Intent(this, RecFdsNormal::class.java)
            startActivity(intent)
        }

    }
}
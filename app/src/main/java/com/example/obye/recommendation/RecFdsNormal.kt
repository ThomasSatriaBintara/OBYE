package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class RecFdsNormal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_fds_normal)

        val fdsNm = findViewById<ImageView>(R.id.backfdsNm)
        fdsNm.setOnClickListener {
            val intent = Intent(this, RecommendationActivity::class.java)
            startActivity(intent)
        }

        val foodNm = findViewById<ImageView>(R.id.foodfdsNm)
        foodNm.setOnClickListener {
            val intent = Intent(this, TRecFoodNormal::class.java)
            startActivity(intent)
        }

        val drinkNm = findViewById<ImageView>(R.id.drinkfdsNm)
        drinkNm.setOnClickListener {
            val intent = Intent(this, TRecDrinkNormal::class.java)
            startActivity(intent)
        }

        val sportNm = findViewById<ImageView>(R.id.sportfdsNm)
        sportNm.setOnClickListener {
            val intent = Intent(this, TRecSportNormal::class.java)
            startActivity(intent)
        }

    }
}

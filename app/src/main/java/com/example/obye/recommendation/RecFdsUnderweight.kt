package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class RecFdsUnderweight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_fds_underweight)

        val fdsUd = findViewById<ImageView>(R.id.backfdsUd)
        fdsUd.setOnClickListener {
            val intent = Intent(this, RecommendationActivity::class.java)
            startActivity(intent)
        }

        val foodUd = findViewById<ImageView>(R.id.foodfdsud)
        foodUd.setOnClickListener {
            val intent = Intent(this, TRecFoodUnderweight::class.java)
            startActivity(intent)
        }

        val drinkUd = findViewById<ImageView>(R.id.drinkfdsud)
        drinkUd.setOnClickListener {
            val intent = Intent(this, TRecDrinkUnderweight::class.java)
            startActivity(intent)
        }

        val sportUd = findViewById<ImageView>(R.id.sportfdsud)
        sportUd.setOnClickListener {
            val intent = Intent(this, TRecSportUnderweight::class.java)
            startActivity(intent)
        }

    }
}

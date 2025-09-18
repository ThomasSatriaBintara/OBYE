package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class RecFdsOverweight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_fds_overweight)

        val fdsOv = findViewById<ImageView>(R.id.backfdsOv)
        fdsOv.setOnClickListener {
            val intent = Intent(this, RecommendationActivity::class.java)
            startActivity(intent)
        }

        val foodOv = findViewById<ImageView>(R.id.foodfdsOv)
        foodOv.setOnClickListener {
            val intent = Intent(this, TRecFoodOverweight::class.java)
            startActivity(intent)
        }

        val drinkOv = findViewById<ImageView>(R.id.drinkfdsOv)
        drinkOv.setOnClickListener {
            val intent = Intent(this, TRecDrinkOverweight::class.java)
            startActivity(intent)
        }

        val sportOv = findViewById<ImageView>(R.id.sportfdsOv)
        sportOv.setOnClickListener {
            val intent = Intent(this, TRecSportOverweight::class.java)
            startActivity(intent)
        }

    }
}

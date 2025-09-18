package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class RecFdsObesity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_fds_obesity)

        val fdsOb= findViewById<ImageView>(R.id.backfdsOb)
        fdsOb.setOnClickListener {
            val intent = Intent(this, RecommendationActivity::class.java)
            startActivity(intent)
        }

        val foodOb = findViewById<ImageView>(R.id.foodfdsOb)
        foodOb.setOnClickListener {
            val intent = Intent(this, TRecFoodObesity::class.java)
            startActivity(intent)
        }

        val drinkOb = findViewById<ImageView>(R.id.drinkfdsOb)
        drinkOb.setOnClickListener {
            val intent = Intent(this, TRecDrinkObesity::class.java)
            startActivity(intent)
        }

        val sportOb = findViewById<ImageView>(R.id.sportfdsOb)
        sportOb.setOnClickListener {
            val intent = Intent(this, TRecSportObesity::class.java)
            startActivity(intent)
        }

    }
}

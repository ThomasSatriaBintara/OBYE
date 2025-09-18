package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecFoodObesity  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_food_obesity)

        val foodOb = findViewById<ImageView>(R.id.backrecfoodob)
        foodOb.setOnClickListener {
            val intent = Intent(this, RecFdsObesity::class.java)
            startActivity(intent)
        }

    }
}
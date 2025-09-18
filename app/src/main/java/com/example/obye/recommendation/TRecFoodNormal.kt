package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecFoodNormal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_food_normal)

        val foodNm = findViewById<ImageView>(R.id.backrecfoodnm)
        foodNm.setOnClickListener {
            val intent = Intent(this, RecFdsNormal::class.java)
            startActivity(intent)
        }

    }
}
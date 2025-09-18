package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecFoodUnderweight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_food_underweight)

        val foodUd = findViewById<ImageView>(R.id.backrecfood)
        foodUd.setOnClickListener {
            val intent = Intent(this, TRecFoodUnderweight::class.java)
            startActivity(intent)
        }

    }
}
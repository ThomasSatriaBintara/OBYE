package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecDrinkUnderweight  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_drink_underweight)

        val drinkUd = findViewById<ImageView>(R.id.backrecdrinkud)
        drinkUd.setOnClickListener {
            val intent = Intent(this, RecFdsUnderweight::class.java)
            startActivity(intent)
        }

    }
}
package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R

class TRecDrinkNormal  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec_drink_normal)

        val drinkNm = findViewById<ImageView>(R.id.backrecdrinknm)
        drinkNm.setOnClickListener {
            val intent = Intent(this, RecFdsNormal::class.java)
            startActivity(intent)
        }

    }
}
package com.example.obye.recommendation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import com.example.obye.home.HomeActivity

class RecommendationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            startActivity(Intent(this@RecommendationActivity, HomeActivity::class.java))
        }

        val fdsunder = findViewById<Button>(R.id.buttonUnderweight)
        fdsunder.setOnClickListener {
            startActivity(Intent(this@RecommendationActivity, RecFdsUnderweight::class.java))
        }

        val fdsnormal = findViewById<Button>(R.id.buttonNormal)
        fdsnormal.setOnClickListener {
            startActivity(Intent(this@RecommendationActivity, RecFdsNormal::class.java))
        }

        val fdsover = findViewById<Button>(R.id.buttonOverweight)
        fdsover.setOnClickListener {
            startActivity(Intent(this@RecommendationActivity, RecFdsOverweight::class.java))
        }

        val fdsobesity= findViewById<Button>(R.id.buttonObesity)
        fdsobesity.setOnClickListener {
            startActivity(Intent(this@RecommendationActivity, RecFdsObesity::class.java))
        }

    }
}

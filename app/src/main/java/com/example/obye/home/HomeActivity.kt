package com.example.obye.home

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import com.example.obye.Stories.StoriesActivity
import com.example.obye.Stories.StoriesCrystalActivity
import com.example.obye.plan.PlanActivity
import com.example.obye.recommendation.RecommendationActivity
import com.example.obye.uischedule.main.MainActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val insStorieView = findViewById<ImageView>(R.id.insStoryView)
        insStorieView.setOnClickListener {
            val intent = Intent(this, StoriesCrystalActivity::class.java)
            startActivity(intent)
        }

        val recView = findViewById<ImageView>(R.id.recView)
        recView.setOnClickListener {
            val intent = Intent(this, RecommendationActivity::class.java)
            startActivity(intent)
        }

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_recommendation -> {
                    val intent = Intent(this, RecommendationActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.menu_plan -> {
                    val intent = Intent(this, PlanActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.menu_schedule -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.menu_stories -> {
                    val intent = Intent(this, StoriesActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
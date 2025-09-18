package com.example.obye.plan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import android.content.Intent
import com.example.obye.home.HomeActivity
import android.widget.ImageView

class PlanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plan)

        val planView = findViewById<ImageView>(R.id.icbackPlan)
        planView.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val btnDrinkk = findViewById<ImageView>(R.id.drinkplanView)
        btnDrinkk.setOnClickListener {
            val intent = Intent(this, PlanInputActivity::class.java)
            startActivity(intent)
        }

        val btnFoodd = findViewById<ImageView>(R.id.foodplanView)
        btnFoodd.setOnClickListener {
            val intent = Intent(this, PlanInputActivity::class.java)
            startActivity(intent)
        }

        val btnSportt = findViewById<ImageView>(R.id.sportplanView)
        btnSportt.setOnClickListener {
            val intent = Intent(this, PlanInputActivity::class.java)
            startActivity(intent)
        }

    }
}
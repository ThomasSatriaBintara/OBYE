package com.example.obye.result

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import com.example.obye.home.HomeActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // Bind views
        val tvResultClass = findViewById<TextView>(R.id.tvResultClass)
        val ivResultImage = findViewById<ImageView>(R.id.ivResultImage)
        val tvResultDescription = findViewById<TextView>(R.id.tvResultDescription)
        val ivNext = findViewById<ImageView>(R.id.ivNext)

        // Get data from intent
        val predictedClass = intent.getStringExtra("PREDICTED_CLASS") ?: "Unknown"

        // Set predicted class text
        tvResultClass.text = "Predicted Class: $predictedClass"

        // Set image and description based on class
        when (predictedClass) {
            "Underweight" -> {
                ivResultImage.setImageResource(R.drawable.result_underweight) // Placeholder image
                tvResultDescription.text = "Your body weight is below the healthy range."
            }
            "Normal Weight" -> {
                ivResultImage.setImageResource(R.drawable.result_normal)
                tvResultDescription.text = "Your weight is within the healthy range. Great job!"
            }
            "Overweight Level I" -> {
                ivResultImage.setImageResource(R.drawable.result_overweight)
                tvResultDescription.text = "You are slightly overweight. Consider managing your diet."
            }
            "Overweight Level II" -> {
                ivResultImage.setImageResource(R.drawable.result_overweight)
                tvResultDescription.text = "You are moderately overweight. Focus on a healthy lifestyle."
            }
            "Obesity Level I" -> {
                ivResultImage.setImageResource(R.drawable.result_overweight)
                tvResultDescription.text = "Your weight is in the obesity range. A balanced lifestyle is key."
            }
            "Obesity Level II" -> {
                ivResultImage.setImageResource(R.drawable.result_obesity)
                tvResultDescription.text = "You are significantly overweight. Consult a healthcare professional."
            }
            "Obesity Level III" -> {
                ivResultImage.setImageResource(R.drawable.result_obesity)
                tvResultDescription.text = "Your weight is critically high. Immediate intervention is advised."
            }
            else -> {
                ivResultImage.setImageResource(R.drawable.result_normal)
                tvResultDescription.text = "Your weight is within the healthy range. Great job!"
            }
        }

        ivNext.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
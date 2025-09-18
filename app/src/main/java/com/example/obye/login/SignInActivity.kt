package com.example.obye.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.R
import com.example.obye.inputdata.InputDataActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signUpLink: TextView = findViewById(R.id.signUpLink)
        val emailInput = findViewById<EditText>(R.id.emailInput) // Pastikan ID cocok dengan layout XML
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener {
            val email = emailInput.text.toString().trim()
            val password = passwordInput.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                // Ambil data dari SharedPreferences
                val sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
                val savedEmail = sharedPref.getString("EMAIL", null)
                val savedPassword = sharedPref.getString("PASSWORD", null)

                if (email == savedEmail && password == savedPassword) {
                    Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

                    startActivity(Intent(this, InputDataActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "Invalid Email or Password", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }

        signUpLink.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
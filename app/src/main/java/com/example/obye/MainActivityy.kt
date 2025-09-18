package com.example.obye

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.obye.login.SignInActivity

class MainActivityy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityy_main)

        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}




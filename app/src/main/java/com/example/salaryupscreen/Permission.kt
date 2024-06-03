package com.example.salaryupscreen

import android.os.Bundle
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Permission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_permission)
        fun goToWelcomePage(view: View) {
            // Start WelcomePage activity
            val intent = Intent(this, WelcomePage::class.java)
            startActivity(intent)
            finish() // Finish PermissionPage to prevent returning to it
        }
        val buttonToName = findViewById<Button>(R.id.buttonToName)
        buttonToName.setOnClickListener {
            val intent = Intent(this, name::class.java)
            startActivity(intent)
        }


    }
}
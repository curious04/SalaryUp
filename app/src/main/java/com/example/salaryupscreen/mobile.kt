package com.example.salaryupscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mobile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mobile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        fun goToName(view: View) {
            // Start WelcomePage activity
            val intent = Intent(this, name::class.java)
            startActivity(intent)
            finish() // Finish PermissionPage to prevent returning to it
        }

        val buttonToMail = findViewById<Button>(R.id.buttonToMail)
        buttonToMail.setOnClickListener {
            val intent = Intent(this, mail::class.java)
            startActivity(intent)
        }
    }
}
package com.example.salaryupscreen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.salaryupscreen.R

class name : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_name)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonToPhone = findViewById<Button>(R.id.buttonToPhone)
        buttonToPhone.setOnClickListener {
            val intent = Intent(this, mobile::class.java)
            startActivity(intent)
        }
        fun goToPermission(view: View) {
            // Start WelcomePage activity
            val intent = Intent(this, Permission::class.java)
            startActivity(intent)
            finish() // Finish PermissionPage to prevent returning to it
        }
    }
}
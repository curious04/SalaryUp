package com.example.salaryupscreen

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_splash_screen)
        val videoView = findViewById<VideoView>(R.id.SplashScreenVideo)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.splash_vid

        val videoUri = Uri.parse(videoPath)
        videoView.setVideoURI(videoUri)


// Start playback
        videoView.setOnPreparedListener { mediaPlayer ->
            mediaPlayer.start()
        }

// Set completion listener to start the MainActivity after the video finishes
        videoView.setOnCompletionListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
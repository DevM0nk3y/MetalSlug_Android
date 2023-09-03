package com.devm0nk3y.metalslug

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var track: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reproductor = Reproductor(this)

        val heavyButton = findViewById<TextView>(R.id.heavy)
        heavyButton.setOnClickListener {
            reproductor.playAudio("heavy")
        }

        val rocketButton = findViewById<TextView>(R.id.rocket)
        rocketButton.setOnClickListener {
            reproductor.playAudio("rocket")
        }

        val flameButton = findViewById<TextView>(R.id.flame)
        flameButton.setOnClickListener {
            reproductor.playAudio("flame")
        }

        val laserButton = findViewById<TextView>(R.id.laser)
        laserButton.setOnClickListener {
            reproductor.playAudio("laser")
        }

        val shotButton = findViewById<TextView>(R.id.shot)
        shotButton.setOnClickListener {
            reproductor.playAudio("shot")
        }

        val enemyButton = findViewById<TextView>(R.id.enemy)
        enemyButton.setOnClickListener {
            reproductor.playAudio("enemy")
        }

        val ironButton = findViewById<TextView>(R.id.iron)
        ironButton.setOnClickListener {
            reproductor.playAudio("iron")
        }

        val dropButton = findViewById<TextView>(R.id.drop)
        dropButton.setOnClickListener {
            reproductor.playAudio("drop")
        }

        val granadeButton = findViewById<TextView>(R.id.granade)
        granadeButton.setOnClickListener {
            reproductor.playAudio("granade")
        }

    }
}
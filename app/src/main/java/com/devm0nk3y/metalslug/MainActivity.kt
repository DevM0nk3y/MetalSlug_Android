package com.devm0nk3y.metalslug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reproductor = Reproductor(this)

        val heavyButton = findViewById<Button>(R.id.heavy)
        heavyButton.setOnClickListener {
            reproductor.playAudio("heavy")
        }

        val rocketButton = findViewById<Button>(R.id.rocket)
        rocketButton.setOnClickListener {
            reproductor.playAudio("rocket")
        }

        val flameButton = findViewById<Button>(R.id.flame)
        flameButton.setOnClickListener {
            reproductor.playAudio("flame")
        }

        val laserButton = findViewById<Button>(R.id.laser)
        laserButton.setOnClickListener {
            reproductor.playAudio("laser")
        }

        val shotButton = findViewById<Button>(R.id.shot)
        shotButton.setOnClickListener {
            reproductor.playAudio("shot")
        }

        val enemyButton = findViewById<Button>(R.id.enemy)
        enemyButton.setOnClickListener {
            reproductor.playAudio("enemy")
        }

        val ironButton = findViewById<Button>(R.id.iron)
        ironButton.setOnClickListener {
            reproductor.playAudio("iron")
        }

        val dropButton = findViewById<Button>(R.id.drop)
        dropButton.setOnClickListener {
            reproductor.playAudio("drop")
        }

        val granadeButton = findViewById<Button>(R.id.granade)
        granadeButton.setOnClickListener {
            reproductor.playAudio("granade")
        }

    }
}
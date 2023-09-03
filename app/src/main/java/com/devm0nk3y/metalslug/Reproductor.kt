package com.devm0nk3y.metalslug

import android.content.Context
import android.media.MediaPlayer

//
//  Reproductor.kt
//  MetalSlug
//
//  Created by Abel Lazaro on 02/09/23.
//

class Reproductor(val context: Context) {

    private lateinit var mediaPlayer: MediaPlayer

    fun playAudio(track: String) {

        val soundId = context.resources.getIdentifier(track, "raw", context.packageName)

        mediaPlayer = MediaPlayer.create(context, soundId)

        mediaPlayer.start()

    }

}
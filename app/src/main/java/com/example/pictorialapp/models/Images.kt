package com.example.pictorialapp.models

import androidx.annotation.DrawableRes
import com.example.pictorialapp.R

/**
 * PROJECT NAME: Pictorial App
 * USER        : jacqui
 * EMAIL       : gitaujaquiine@gmail.com
 * DATE        : Oct, 10/7/23
 * TIME        : 4:56 AM
 */
data class Images(
    @DrawableRes val image: Int
)
val photos = listOf(
    Images(R.drawable.rectangle_2),
    Images(R.drawable.rectangle_2_3),
    Images(R.drawable.rectangle_2_13),
    Images(R.drawable.rectangle_2_4),
    Images(R.drawable.rectangle_2_5),
    Images(R.drawable.rectangle_2_6),
    Images(R.drawable.rectangle_2_7),
    Images(R.drawable.rectangle_2_8),
    Images(R.drawable.rectangle_2_9),
    Images(R.drawable.rectangle_2_1),
    Images(R.drawable.rectangle_2_10),
    Images(R.drawable.rectangle_2_11)
)
package com.example.pictorialapp.models

import androidx.annotation.DrawableRes
import com.example.pictorialapp.R

/**
 * PROJECT NAME: Pictorial App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Sept, 9/20/23
 * TIME        : 11:01 PM
 */
data class User(
    val name: String,
    val userName: String,
    @DrawableRes val profilePic: Int,
    @DrawableRes val image: Int
)
val userList = listOf(
    User("John Doe", "johndoe123", R.drawable.ellipse, R.drawable.rectangle_2),
    User("Alice Smith", "alice_smith", R.drawable.ellipse, R.drawable.rectangle_2_1),
    User("Bob Johnson", "bob123", R.drawable.ellipse, R.drawable.rectangle_2_10),
    User("Emily Brown", "emilyb", R.drawable.ellipse, R.drawable.rectangle_2_11),
    User("Michael Wilson", "mikeW", R.drawable.ellipse, R.drawable.rectangle_2_12),
    User("Sarah Davis", "sarahd", R.drawable.ellipse, R.drawable.rectangle_2_13),
    User("David Lee", "davidlee88", R.drawable.ellipse, R.drawable.rectangle_2_2),
    User("Olivia Clark", "olivia_c", R.drawable.ellipse, R.drawable.rectangle_2_3),
    User("James Anderson", "jamesa", R.drawable.ellipse, R.drawable.rectangle_2_4),
    User("Sophia Martinez", "sophiam", R.drawable.ellipse, R.drawable.rectangle_2_5)
)



package com.example.pictorialapp.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pictorialapp.models.User
import com.example.pictorialapp.models.userList
import com.example.pictorialapp.ui.components.ProminentImageItem

/**
 * PROJECT NAME: Pictorial App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Sept, 9/21/23
 * TIME        : 11:14 PM
 */

@Composable
fun DiscoverScreen() {
    WhatsNew(userList = userList)
}
@Composable
fun WhatsNew(
    modifier: Modifier = Modifier,
    userList: List<User>
    ){
    LazyRow(modifier = modifier.padding(horizontal = 16.dp)){
        items(userList) {User ->
            ProminentImageItem(user = User)
        }
    }
}
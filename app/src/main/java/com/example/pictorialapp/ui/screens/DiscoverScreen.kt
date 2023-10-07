package com.example.pictorialapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pictorialapp.models.Images
import com.example.pictorialapp.models.User
import com.example.pictorialapp.models.photos
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
    Browse(photos = photos)
}
@Composable
fun WhatsNew(
    modifier: Modifier = Modifier,
    userList: List<User>

    ){
    LazyRow(modifier = modifier){
        items(userList) {User ->
            ProminentImageItem(user = User)
        }
    }
}

@Composable
fun Browse(
    modifier: Modifier = Modifier,
    photos: List<Images>
){
    LazyVerticalStaggeredGrid(
        modifier = modifier,
        columns = StaggeredGridCells.Fixed(2),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
    ){
        items(photos){ Images ->
            Browse(photos = photos)
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WhatsNewPreview(){
    DiscoverScreen()
}
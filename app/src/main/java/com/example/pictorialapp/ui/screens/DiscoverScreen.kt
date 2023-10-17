package com.example.pictorialapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pictorialapp.models.Images
import com.example.pictorialapp.models.User
import com.example.pictorialapp.models.photos
import com.example.pictorialapp.models.userList
import com.example.pictorialapp.ui.components.BrowseImage
import com.example.pictorialapp.ui.components.ProminentImageItem

/**
 * PROJECT NAME: Pictorial App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Sept, 9/21/23
 * TIME        : 11:14 PM
 */

@Composable
fun DiscoverScreen( modifier: Modifier = Modifier) {


    Column( modifier = modifier
        .fillMaxSize()
        .padding(vertical = 48.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(24.dp)) {
        WhatsNew(userList = userList)
        Browse(photos = photos)
    }
}
@Composable
fun WhatsNew(
    modifier: Modifier = Modifier,
    userList: List<User>

    ){
    LazyRow(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(userList) { User ->
            ProminentImageItem(
                header = "What's New Today",
                user = User
            )
        }
    }
}

@Composable
fun Browse(
    modifier: Modifier = Modifier,
    photos: List<Images>
) {
    LazyVerticalStaggeredGrid(modifier = modifier, columns = StaggeredGridCells.Fixed(2)) {
        items(photos) { Images ->
            BrowseImage(images = Images)

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WhatsNewPreview(){
    DiscoverScreen()
}
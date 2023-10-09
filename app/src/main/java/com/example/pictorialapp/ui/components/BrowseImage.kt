package com.example.pictorialapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pictorialapp.models.Images
import com.example.pictorialapp.models.photos
import com.example.pictorialapp.ui.screens.Browse

/**
 * PROJECT NAME: Pictorial App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Oct, 10/7/23
 * TIME        : 5:36 AM
 */

@Composable
fun BrowseImage(modifier:Modifier = Modifier, header: String, images: Images){
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
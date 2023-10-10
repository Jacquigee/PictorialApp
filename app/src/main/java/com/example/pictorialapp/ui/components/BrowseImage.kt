package com.example.pictorialapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.pictorialapp.models.photos


/**
 * PROJECT NAME: Pictorial App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Oct, 10/7/23
 * TIME        : 5:36 AM
 */

@Composable
fun BrowseImage(modifier: Modifier = Modifier) {
    Browse(photos = photos)
}


@Composable
fun Browse(
    modifier: Modifier = Modifier,
    photos: List<Images>
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        LazyVerticalStaggeredGrid(
            modifier = modifier.weight(1f),
            columns = StaggeredGridCells.Fixed(2),
            verticalItemSpacing = 4.dp,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            contentPadding = PaddingValues(10.dp)
        ) {
            items(photos) { Images ->
                Browse(photos = photos)
            }
        }
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BrowsePreview() {
    BrowseImage()
}
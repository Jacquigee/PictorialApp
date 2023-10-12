package com.example.pictorialapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
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
fun BrowseImage(modifier: Modifier = Modifier, images: Images) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier.size(128.dp),
            painter = painterResource(id = images.image),
            contentDescription = "Image" )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BrowsePreview() {
    BrowseImage(images = photos.first())
}
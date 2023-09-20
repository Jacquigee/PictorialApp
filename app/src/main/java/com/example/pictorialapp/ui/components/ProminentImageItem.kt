package com.example.pictorialapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.pictorialapp.models.User
import com.example.pictorialapp.models.userList

/**
 * PROJECT NAME: Pictorial App
 * USER        : jacqui
 * EMAIL       : gitaujaquiline@gmail.com
 * DATE        : Sept, 9/20/23
 * TIME        : 11:20 PM
 */

@Composable
fun ProminentImageItem(modifier: Modifier = Modifier, user: User) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier.size(343.dp),
            painter = painterResource(id = user.image),
            contentDescription = "Image",
            contentScale = ContentScale.FillBounds

        )

        Spacer(modifier = Modifier.height(16.dp))

        ConstraintLayout(modifier = Modifier.padding(bottom = 8.dp)) {
            val (profile, name, userName) = createRefs()

            Image(
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(28.dp)
                    .constrainAs(profile) {
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                    },
                painter = painterResource(id = user.profilePic),
                contentDescription = "Profile picture"
            )
            Text(
                modifier = Modifier.constrainAs(name) {
                    start.linkTo(profile.end, margin = 8.dp)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                }, text = user.name, fontSize = 13.sp, fontWeight = FontWeight.Bold
            )
            Text(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .offset(x = 4.dp)
                    .constrainAs(userName) {
                        start.linkTo(profile.end)
                        top.linkTo(name.bottom)
                        end.linkTo(parent.end)
                    }, text = user.userName, fontSize = 11.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProminentImageItemPreview() {
    ProminentImageItem(user = userList.first())
}
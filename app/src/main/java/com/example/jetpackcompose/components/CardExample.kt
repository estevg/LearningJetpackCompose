package com.example.jetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.Message
import com.example.jetpackcompose.R

@Composable
fun CardExample(msg: Message) {
    Column(modifier = Modifier.padding(16.dp)) {

        val imageModifier = Modifier
            .requiredHeight(150.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(10.dp))

        Image(
            painter = painterResource(R.mipmap.header),
            contentDescription = "Contact profile picture",
            modifier = imageModifier,
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = msg.author, style = MaterialTheme.typography.h6)
        // Add a vertical space between the author and message texts
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = msg.body, style = MaterialTheme.typography.body1)
        Text(text = msg.body, style = MaterialTheme.typography.body2)
    }
}


@Preview(
    showBackground = true,
    name = "Preview Card"
)
@Composable
private fun PreviewCard() {
    Column {
        CardExample(
            msg = Message("Colleague", "Hey, take a look at Jetpack Compose, it's great!")
        )
    }
}
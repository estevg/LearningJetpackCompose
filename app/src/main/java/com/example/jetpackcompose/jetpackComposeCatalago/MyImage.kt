package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AppRegistration
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Ejemplo",
        alpha = 0.5f
    )
}


@Composable
fun MyImageAdvanced() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Ejemplo",
        // modifier = Modifier.clip(RoundedCornerShape(25f))
        modifier = Modifier
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)

    )
}


@Preview(showBackground = true)
@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Outlined.AppRegistration,
        contentDescription = "Icon",
        tint = Color.DarkGray
    )
}
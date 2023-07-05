package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyRow() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .horizontalScroll(
                rememberScrollState()
            ),
    ) {
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Gray)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Blue)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Gray)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Blue)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Gray)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Blue)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Red)
                .height(100.dp)
                .width(50.dp)
        )
        Text(
            text = "HOLA 1", modifier = Modifier
                .background(Color.Yellow)
                .height(100.dp)
                .width(50.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyRow() {
    MyRow()
}
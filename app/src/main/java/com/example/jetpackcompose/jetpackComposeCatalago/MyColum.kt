package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyColum() {
    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(
            rememberScrollState()
        ), verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Red)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Gray)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Gray)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Gray)
            .height(100.dp)
            .fillMaxWidth())
        Text(text = "HOLA 1", modifier = Modifier
            .background(Color.Gray)
            .height(100.dp)
            .fillMaxWidth())

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewColum() {
    MyColum()
}

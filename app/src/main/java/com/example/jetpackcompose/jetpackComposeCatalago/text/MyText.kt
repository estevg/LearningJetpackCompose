package com.example.jetpackcompose.jetpackComposeCatalago.text

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyText() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "ESTO ES UN EJEMPLO")
        Text(text = "ESTO ES UN EJEMPLO", color = Color.Blue)
        Text(text = "ESTO ES UN EJEMPLO", fontWeight = FontWeight.Light)
        Text(text = "ESTO ES UN EJEMPLO", fontWeight = FontWeight.Bold)
        Text(text = "ESTO ES UN EJEMPLO", fontStyle = FontStyle.Italic)
        Text(text = "ESTO ES UN EJEMPLO", fontFamily = FontFamily.Cursive)
        Text(text = "ESTO ES UN EJEMPLO", letterSpacing = 20.sp)
        Text(text = "ESTO ES UN EJEMPLO", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(text = "ESTO ES UN EJEMPLO", style = TextStyle(textDecoration = TextDecoration.LineThrough))
        Text(text = "ESTO ES UN EJEMPLO", style = TextStyle(textDecoration = TextDecoration.Underline))
        Text(text = "ESTO ES UN EJEMPLO", style = TextStyle(textDecoration = TextDecoration.combine(
            listOf(TextDecoration.Underline, TextDecoration.LineThrough)
        )))
        Text(text = "ESTO ES UN EJEMPLO", fontSize = 30.sp)


    }

}
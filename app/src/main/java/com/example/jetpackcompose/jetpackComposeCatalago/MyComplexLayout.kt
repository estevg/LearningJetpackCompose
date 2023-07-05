package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyComplexLayout() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")

        }
        MySpacer(40)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Red)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center

            ) {
                Text(text = "Ejemplo 3")
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Blue)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }
        MySpacer(10)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Yellow),
            contentAlignment = Alignment.BottomCenter

        ) {
            Text(text = "Ejemplo 3")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComplexLayout() {
    MyComplexLayout()
}
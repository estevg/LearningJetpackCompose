package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyDivider() {
    Divider(modifier = Modifier.padding(top = 20.dp), color = Color.Red)
}
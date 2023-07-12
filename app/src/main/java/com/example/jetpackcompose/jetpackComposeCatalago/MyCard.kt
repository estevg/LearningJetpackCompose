package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyCard() {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(10.dp),
//      shape = RoundedCornerShape(5.dp)
        shape = MaterialTheme.shapes.small,
        /*colors = CardDefaults.cardColors(
            contentColor = Color.Blue,
            containerColor = Color.Red
        )*/

    ) {
        Column(Modifier.padding(16.dp)) {
            Text(text = "Test 1")
            Text(text = "Test 1")
            Text(text = "Test 1")
            Text(text = "Test 1")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyCard() {
    MyCard()
}
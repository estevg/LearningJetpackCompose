package com.example.jetpackcompose.jetpackComposeCatalago.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MyButton() {

    var state by rememberSaveable {
        mutableStateOf(true)
    }

    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { state = !state },
            colors = ButtonDefaults.buttonColors(
                Color.Red,
                Color.Yellow,
            ),
            enabled = state,
            border = BorderStroke(2.dp, Color.Cyan),
        )
        {
            Text(text = "HOLA")
        }

        OutlinedButton(
            enabled = state,
            onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(
                Color.Red,
                Color.Yellow,
                Color.Black,
                Color.Blue
            ),
        ) {
            Text(text = "HOLA")
        }

        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(top = 10.dp)) {
            Text(text = "HOLA")
        }
    }
}
package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyTextField(name: String, onValueChange: (String) -> Unit) {

    TextField(value = name, onValueChange = { onValueChange(it) })
}

@Composable
fun MyTextFieldAdvanced() {
    var myText by remember {
        mutableStateOf("HOLA")
    }

    TextField(
        value = myText,
        onValueChange = {
            myText = if (it.contains("a")) {
                it.replace("a", "")
            } else {
                it
            }
        },
        label = {
            Text("Introduce tu nombre")
        },
        modifier = Modifier.padding(10.dp),
        textStyle = TextStyle(
            color = Color.Blue,
            fontSize = 20.sp
        ),
    )
}

@Preview(showBackground = true)
@Composable
fun MyTextFieldOutlined() {
    var myText by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        value = myText,
        onValueChange = {
            myText = it
        },
        label = {
            Text("Introduce tu nombre")
        },
        modifier = Modifier.padding(10.dp),
        textStyle = TextStyle(
            color = Color.Blue,
            fontSize = 20.sp
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Black,
            unfocusedBorderColor = Color.Yellow,
            focusedLabelColor = Color.Red,
            unfocusedLabelColor = Color.Green
        )
    )
}
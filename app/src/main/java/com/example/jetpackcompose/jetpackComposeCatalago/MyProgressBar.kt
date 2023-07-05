package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressBar() {
    var showLoading by rememberSaveable {
        mutableStateOf(false)
    }

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        if(showLoading){
            CircularProgressIndicator(color = Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(modifier = Modifier.padding(top = 32.dp), color = Color.Red, trackColor = Color.Blue)
        }

        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "Presiona aqui")
        }
    }
}

@Composable
fun MyProgressBarAdvanced() {
    var progress by rememberSaveable {
        mutableStateOf(0f)
    }

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        CircularProgressIndicator(color = Color.Red, strokeWidth = 3.dp, progress = progress)

        Button(onClick = { progress += 0.1f }) {
            Text(text = "Incrementar")
        }

        Button(onClick = {  progress -= 0.1f }) {
            Text(text = "Decrementar")
        }
    }
}
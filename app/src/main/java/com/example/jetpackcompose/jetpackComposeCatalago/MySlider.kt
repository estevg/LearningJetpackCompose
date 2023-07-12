package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import kotlin.math.roundToInt


@Composable
fun MySlider() {
    var progress by rememberSaveable {
        mutableStateOf(0f)
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Slider(value = progress, onValueChange = { progress = it })
        Text(text = progress.toString())
    }
}


@Composable
fun MyAdvanceSlider() {
    var progress by rememberSaveable {
        mutableStateOf(0f)
    }

    var completeValue by rememberSaveable {
        mutableStateOf("")
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Slider(
            value = progress,
            onValueChange = { progress = it },
            valueRange = 0f..10f,
            steps = 9,
            onValueChangeFinished = { completeValue = progress.roundToInt().toString() })
        Text(text = completeValue)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyRangeSlider() {

    var currentRage by remember {
        mutableStateOf(1f..10f)
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        RangeSlider(
            value = currentRage,
            onValueChange = { currentRage = it },
            valueRange = 1f..10f,
            steps = 10,
        )
        Text(text = "min: ${currentRage.start.roundToInt()}")
        Text(text = "max: ${currentRage.endInclusive.roundToInt()}")

    }
}
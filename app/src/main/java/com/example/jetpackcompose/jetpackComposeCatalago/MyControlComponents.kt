package com.example.jetpackcompose.jetpackComposeCatalago

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.Text
import androidx.compose.material.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.CheckInfo

@Composable
fun MySwitch() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    Switch(
        enabled = false,
        checked = state,
        onCheckedChange = { state = !state },
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            checkedThumbColor = Color.Blue,
            uncheckedTrackColor = Color.Black,
            checkedTrackColor = Color.Green,
            checkedTrackAlpha = 0.2f,
            disabledCheckedTrackColor = Color.Green,
            disabledUncheckedThumbColor = Color.Magenta,
            disabledUncheckedTrackColor = Color.Magenta,
            disabledCheckedThumbColor = Color.Green

        )
    )
}


@Composable
fun MyCheckbox() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    Checkbox(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Cyan,
            uncheckedColor = Color.Green,
            checkmarkColor = Color.Blue
        )
    )
}

@Composable
fun MyCheckboxWithText() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }
    Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(checked = state, onCheckedChange = { state = !state })
        Text("Ejemplo")
    }
}

@Composable
fun MyCheckBoxWithStateHosting(checkInfo: CheckInfo) {
    Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = checkInfo.status,
            onCheckedChange = { checkInfo.onChangeState(!checkInfo.status) })
        Text(checkInfo.title)
    }
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var status by rememberSaveable { mutableStateOf(false) }
        CheckInfo(
            title = "Este es el bueno",
            status = status,
            onChangeState = { myNewStatus -> status = myNewStatus }
        )
    }
}

@Composable
fun MyCheckBoxThreeState() {
    var status by rememberSaveable { mutableStateOf(ToggleableState.Off) }
    TriStateCheckbox(state = status, onClick = {
        status = when (status) {
            ToggleableState.On -> {
                ToggleableState.Off
            }

            ToggleableState.Off -> {
                ToggleableState.Indeterminate
            }

            ToggleableState.Indeterminate -> {
                ToggleableState.On
            }
        }
    })
}

@Composable
fun MyRadioButton() {

    var status by rememberSaveable {
        mutableStateOf(false)
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = status,
            onClick = { status = !status },
            enabled = true,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Green,
                disabledColor = Color.Blue,
                unselectedColor = Color.LightGray
            )
        )
    }
}

@Composable
fun MyRadioButtonWithState(name: String, modifier: Modifier = Modifier.fillMaxSize(), onItemSelected: (String) -> Unit, ) {
    Column(modifier) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = name == "Esteban", onClick = { onItemSelected("Esteban") }, enabled = true,
            )
            Text(text = "Esteban")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = name == "Elliot", onClick = { onItemSelected("Elliot") }, enabled = true,
            )
            Text(text = "Elliot")
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = name == "Ska", onClick = { onItemSelected("Ska") }, enabled = true,
            )
            Text(text = "Ska")
        }
    }

}
package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyRadioButton() {
    var selecte by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = selecte,
            onClick = { selecte = !selecte },
            enabled = true,
            colors = RadioButtonDefaults.colors(
                selectedColor = Color.Red,
                unselectedColor = Color.Blue,
                disabledSelectedColor = Color.Gray,
                disabledUnselectedColor = Color.LightGray
            )
        )
        Text("RadioButton")
    }
}

@Composable
fun MyRadioButton2() {
    var selected by remember { mutableStateOf("Opcion 1") }
    Column() {
        Spacer(Modifier.size(20.dp))


        RadioButtonItem("Opción 1", selected) { selected = it }
        RadioButtonItem("Opción 2", selected) { selected = it }
        RadioButtonItem("Opción 3", selected) { selected = it }
        RadioButtonItem("Opción 4", selected) { selected = it }


    }

}


@Composable
fun MyRadioButton3() {
    var selected by remember { mutableStateOf("a") }
   // val options = listOf("coche", "moto", "tren")
    val options =('a'..'x').map { it.toString() }

    Column(Modifier.verticalScroll(rememberScrollState())) {
        options.forEach {

            RadioButtonItem(it, selected) { selected = it }
        }
    }

}

@Composable
fun RadioButtonItem(valor: String, selecte: String, onSelected: (String) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = selecte == valor,
            onClick = { onSelected(valor) })
        Text(text = valor)
    }

}











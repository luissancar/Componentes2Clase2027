package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyDropDownMenu(modifier: Modifier = Modifier) {
    var selectedOption by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val options = listOf("Op1", "Op2", "Op3", "Op4", "Op5")
    Column(modifier = modifier.fillMaxWidth()) {
        OutlinedTextField(
            value = selectedOption,
            onValueChange = { selectedOption = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable(
                    onClick = { expanded = true })
                .fillMaxWidth()
        )
        DropdownMenu(
            expanded=expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ){
            options.forEach {
                option ->
                DropdownMenuItem(
                    onClick = {
                        selectedOption = option
                        expanded = false
                    },
                    text = { Text(text = option) }
                )
            }
        }
        if (selectedOption.isEmpty())
            Text("No has seleccionado ninguna opción")
        else
            Text("La opción seleccionada es $selectedOption")
    }
}
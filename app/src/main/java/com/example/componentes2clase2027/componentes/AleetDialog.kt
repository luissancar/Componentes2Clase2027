package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyAlertDialog() {
    var openDialog by remember { mutableStateOf(false) }
    if (openDialog) {
        BasicAlertDialog(
            onDismissRequest = { openDialog = false }
        ) {
            Surface(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentWidth(),
                shape = MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation
            ) {

                Column() {
                    Text("Esto es un ejemplo de alerta")
                    Button(onClick = { openDialog = false }) { Text("Ok") }
                }
            }
        }
    }
    Button(onClick = { openDialog = true })
    { Text("Mostrar alerta") }
}
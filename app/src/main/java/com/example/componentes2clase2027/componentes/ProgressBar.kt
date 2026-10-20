package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Remove
import androidx.compose.material.icons.rounded.Visibility
import androidx.compose.material.icons.rounded.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressBar1(modifier: Modifier = Modifier) {
    Column(modifier) {
        CircularProgressIndicator(
            color = Color.Red,
            strokeWidth = 10.dp
        )
        LinearProgressIndicator(
            Modifier.padding(top = 32.dp),
            color = Color.Blue,
            trackColor = Color.LightGray
        )
    }
}

@Composable
fun MyProgressBar2(modifier: Modifier = Modifier) {
    Column(modifier) {
        var show by remember { mutableStateOf(false) }
        Button(
            onClick = { show = !show }
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                var icono = Icons.Rounded.Home
                var texto = ""
                if (show) {
                    icono = Icons.Rounded.VisibilityOff
                    texto = "Ocultar"
                } else {
                    icono = Icons.Rounded.Visibility
                    texto = "Mostar"
                }
                Icon(imageVector = icono, contentDescription = texto)
            }
        }
        if (show)
            MyProgressBar1(

            )
    }
}


@Composable
fun MyProgressBar3(modifier: Modifier = Modifier) {
    var progress by remember { mutableStateOf(0f) }
    Column(
        modifier=modifier, verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LinearProgressIndicator(
            progress = { progress }
        )

        CircularProgressIndicator(
            progress = { progress }
        )
        Row()
        {
            Button(onClick = { if (progress < 1f) progress += 0.1f }) {
                ContenidoButton(Icons.Rounded.Add, "aumentar")
            }

            Button(onClick = { if (progress > 0f) progress -= 0.1f }) {
                ContenidoButton(Icons.Rounded.Remove, "reducir")
            }
        }

    }
}

@Composable
fun ContenidoButton(icono: ImageVector, texto: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(imageVector = icono, contentDescription = texto)
        Text(text = texto)
    }
}











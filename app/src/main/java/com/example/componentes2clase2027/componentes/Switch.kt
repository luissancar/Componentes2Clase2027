package com.example.componentes2clase2027.componentes

import android.widget.Switch
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySwitch(){
    var activado by remember { mutableStateOf(false) }
    var activadoCheck by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("Activar")
        Spacer(Modifier.width(16.dp))
        Switch(
            checked = activado,
            onCheckedChange = {activado = it}
        )
    }

    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("Activar")
        Spacer(Modifier.width(16.dp))
        Checkbox(
            checked = activadoCheck,
            onCheckedChange = {activadoCheck = it}
        )
    }
}










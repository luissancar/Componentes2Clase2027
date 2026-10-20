package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyDivider() {
    Column(Modifier.fillMaxSize()) {
        Text("Item 1")
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.Red
        )
        Text("Item 2")
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 10.dp,
            color = Color.Blue
        )
        Row{
            Text("Item 3")
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 100.dp,
                color = Color.Green
            )
            Text("Item 4")
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                thickness = 1.dp,
                color = Color.Yellow
            )
            Text("Item 5")

        }
    }
}
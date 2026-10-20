package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyCard(nombre: String,apellidos: String) {
    Card(
        Modifier
            .fillMaxWidth()
            .padding(20.dp),
        elevation = CardDefaults.cardElevation(40.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.LightGray,
            contentColor = Color(0xFF00AA00)
        ),
        border= BorderStroke(3.dp,Color.Yellow)
    )
    {
        Column(){
            Text(text = nombre, modifier = Modifier.padding(10.dp))
            Text(text = apellidos, modifier = Modifier.padding(10.dp))
        }
    }
}
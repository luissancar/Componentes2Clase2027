package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.componentes2clase2027.R

@Composable
fun EjemploImagenIcono(modifier: Modifier= Modifier){
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id=R.drawable.piano),
            contentDescription = "piano",
            modifier=Modifier.size(200.dp))


        AsyncImage(
            model = "https://cataas.com/cat",
            contentDescription = "Cat",
            modifier = Modifier.size(200.dp)
        )
        Icon(imageVector = Icons.Default.Favorite,
            contentDescription = "icono favorito",
            modifier = Modifier.size(200.dp),
            tint = Color.Black
            )
    }
}
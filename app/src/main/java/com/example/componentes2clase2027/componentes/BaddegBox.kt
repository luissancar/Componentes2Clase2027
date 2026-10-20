package com.example.componentes2clase2027.componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Hotel
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun MyBadgeBox() {
    var badgeCount by remember { mutableStateOf(0) }
    Box(Modifier.fillMaxSize()) {
        LaunchedEffect(Unit) {
            while (true) {
                delay(100)
                if (badgeCount++ > 50)
                    badgeCount = 0
            }
        }
        BadgedBox(
            badge = {
                Badge(
                    contentColor = Color.Red,
                    containerColor = Color.Blue
                )

                {
                    Text(text = badgeCount.toString(), fontSize = 10.sp)
                }

            }) {
            Icon(
                modifier=Modifier.size(30.dp),
                imageVector = Icons.Default.Hotel,
                contentDescription = ""
            )
        }
    }
}
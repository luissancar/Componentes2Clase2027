package com.example.componentes2clase2027

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.componentes2clase2027.componentes.EjemploImagenIcono
import com.example.componentes2clase2027.componentes.MyAlertDialog
import com.example.componentes2clase2027.componentes.MyBadgeBox
import com.example.componentes2clase2027.componentes.MyCard
import com.example.componentes2clase2027.componentes.MyDivider
import com.example.componentes2clase2027.componentes.MyDropDownMenu
import com.example.componentes2clase2027.componentes.MyProgressBar1
import com.example.componentes2clase2027.componentes.MyProgressBar2
import com.example.componentes2clase2027.componentes.MyProgressBar3
import com.example.componentes2clase2027.componentes.MyRadioButton
import com.example.componentes2clase2027.componentes.MyRadioButton2
import com.example.componentes2clase2027.componentes.MyRadioButton3
import com.example.componentes2clase2027.componentes.MySlider
import com.example.componentes2clase2027.componentes.MySlider2
import com.example.componentes2clase2027.componentes.MySwitch
import com.example.componentes2clase2027.ui.theme.Componentes2Clase2027Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Componentes2Clase2027Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // EjemploImagenIcono(modifier)
    //MyProgressBar1(modifier)
    //MyProgressBar2(modifier)
    //MyProgressBar3(modifier)
    Column(modifier) {
      //  MyRadioButton()
       // MyRadioButton2()
       // MyRadioButton3()
      //  MyCard("Antonio","López")
        //MyCard("Pedro","López")
        //MyCard("Juan","López")
       // MyBadgeBox()
        //MyDivider()
       // MyAlertDialog()
      //  MySlider()
       // MySlider2()
        MySwitch()
    }
   // MyDropDownMenu(modifier)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Componentes2Clase2027Theme {
        Greeting("Android")
    }
}
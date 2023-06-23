package com.example.jetpackcompose_001

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose_001.ui.theme.JetpackCompose_001Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose_001Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android con JetPack Compose")
//                    Message()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true )
@Composable
fun Message() {
    Text(text = "Me gusta el olor del cafe en la mañanas")
}

@Preview (showBackground = true)
@Composable
fun Messagetwo() {
    Text(text = "Sexto TI")
}

@Preview(showBackground = true)
@Composable
fun MessageThee() {
    Text(text = "Sexto TI")
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    JetpackCompose_001Theme {
//        Greeting("Android")
//    }
//}
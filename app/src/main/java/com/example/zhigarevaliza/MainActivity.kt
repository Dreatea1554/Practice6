package com.example.zhigarevaliza

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.zhigarevaliza.ui.theme.ZhigarevaLizaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZhigarevaLizaTheme {
                    Greeting(
                        name = "Жигарєва Єлизавета",
                    )
                }
            }
        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Magenta) {
        Text(
            text = "Hi, my name is Жигарєва Єлизавета",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ZhigarevaLizaTheme {
        Greeting("Жигарєва Єлизавета")
    }
}
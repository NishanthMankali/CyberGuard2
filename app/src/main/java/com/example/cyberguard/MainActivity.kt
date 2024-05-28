package com.example.cyberguard

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cyberguard.ui.theme.CyberGuardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CyberGuardTheme {
                // Your UI components here
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Button(onClick = { /* Handle click */ }) {
        Text("Click me")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CyberGuardTheme {
        MyApp()
    }
}

package com.cardlay.expensis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cardlay.expensis.ui.theme.ExpensisTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpensisTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Welcome(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
private fun Welcome(modifier: Modifier = Modifier) {
    Text(
        text = "Welcome!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    ExpensisTheme {
        Welcome()
    }
}
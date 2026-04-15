package com.example.helloworld1

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.helloworld1.ui.theme.HelloWorld1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorld1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(Modifier.padding(innerPadding)) {
                        var teksti by remember { mutableStateOf("Hei maailma!")}

                    Button(onClick = { teksti = "Nappi painettu!" }) {
                        Text("Paina minua!")
                    }
                    Spacer(modifier = Modifier.fillMaxSize(0.2f))
                    Text(teksti)
                }
            }
        }
    }
}
}


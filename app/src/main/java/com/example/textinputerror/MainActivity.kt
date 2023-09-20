package com.example.textinputerror

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.textinputerror.ui.theme.TextInputErrorTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterial3Api
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextInputErrorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        TextFieldSample()
                        BasicTextFieldSample()
                    }
                }
            }
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun TextFieldSample() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("TextField Sample") }
    )
}

@Composable
fun BasicTextFieldSample() {
    var text by remember { mutableStateOf("BasicTextField Sample") }

    BasicTextField(
        value = text,
        onValueChange = { text = it }
    )
}
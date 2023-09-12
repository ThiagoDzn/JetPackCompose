package com.example.aulajetpackcomposestate

import android.os.Bundle
import android.util.Log
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aulajetpackcomposestate.ui.theme.AulaJetPackComposeStateTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AulaJetPackComposeStateTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ){
                        var vlrDoTextField by remember {
                            mutableStateOf("")
                        }
                        Column() {
                            TextField(value = vlrDoTextField, onValueChange = {
                                vlrDoTextField = it;
                                Log.i("####", vlrDoTextField)

                            })

                        }
                    }
                }
        }
    }
}


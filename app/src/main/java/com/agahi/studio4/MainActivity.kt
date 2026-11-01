
package com.agahi.studio4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                var selectedMode by remember {
                    mutableStateOf("Headlines")
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "AGAHI Studio 4",
                        style = MaterialTheme.typography.headlineMedium
                    )

                    Text("Choose your content mode")

                    listOf(
                        "Headlines",
                        "Breaking News",
                        "Vlog"
                    ).forEach { mode ->
                        Button(
                            onClick = { selectedMode = mode },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(mode)
                        }
                    }

                    Text("Selected mode: $selectedMode")
                }
            }
        }
    }
}


package com.eramiro.fkp

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Composable
fun FkpTestScreen() {
    // Esto es como un LinearLayout vertical
    androidx.compose.foundation.layout.Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
    ) {
        androidx.compose.material3.Text(
            text = "¡Compose funciona!",
            style = androidx.compose.material3.MaterialTheme.typography.headlineMedium,
            color = Color(0xFFC2185B) // Un color fucsia manual para probar
        )

        androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Button(onClick = { /* Acción aquí */ }) {
            androidx.compose.material3.Text("Mi primer botón en Compose")
        }
    }
}

// ESTO ES LO QUE SUSTITUYE AL EMULADOR PARA DISEÑAR
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewFkpTestScreen() {
    FkpTestScreen()
}
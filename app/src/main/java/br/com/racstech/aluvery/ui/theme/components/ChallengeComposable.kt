package br.com.racstech.aluvery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ChallengeComposable() {
    Row {
        Box(modifier = Modifier
            .height(100.dp)
            .width(50.dp)
            .background(Color.Blue))
        Column(Modifier.fillMaxWidth(1f)) {
            Text(text = "Test1", modifier = Modifier.background(Color.LightGray).fillMaxWidth(1f))
            Text(text = "Test2")
        }
    }
}
package br.com.racstech.aluvery.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.racstech.aluvery.ui.theme.AluveryTheme

@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto ainda maior")
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ComposicoesPreview() {
    Column(
        Modifier
            .padding(8.dp)
            .background(color = Color.Blue)
            .padding(8.dp)
            .fillMaxWidth(1f)
            .fillMaxHeight(1f)
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 16.dp,
                )
                .background(color = Color.Green)
                .fillMaxWidth(1f)
        ) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box(
            Modifier
                .padding(8.dp)
                .background(color = Color.Red)
                .padding(8.dp)
                .fillMaxWidth(1f)
        ) {
            Row(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.Cyan)
                    .padding(8.dp)
                    .fillMaxWidth(1f)
            ) {
                Text(text = "Texto 5")
                Text(text = "Texto 6")
            }
            Column(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.Gray)
                    .padding(8.dp)
            ) {
                Text(text = "Texto 7")
                Text(text = "Texto 8")
            }
        }
    }
}

@Preview(
    name = "TextPreview",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun MyFirstComposablePreview() {
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}
package br.com.racstech.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import br.com.racstech.aluvery.sampleData.sampleSections
import br.com.racstech.aluvery.ui.screens.HomeScreen
import br.com.racstech.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    AluveryTheme {
        Surface {
            HomeScreen(
                sampleSections
            )
        }
    }
}



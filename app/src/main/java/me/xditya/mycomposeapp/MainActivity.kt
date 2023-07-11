package me.xditya.mycomposeapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.xditya.mycomposeapp.ui.theme.MyComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyComposeApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyComposeApp() {
    val ctx = LocalContext.current
        Row(
            Modifier
                .fillMaxSize()
        ) {
            Column (
                modifier = Modifier
                    .padding(16.dp)
            ){
                Card(
                    shape = RoundedCornerShape(8.dp),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
                ) {
                    Column(
                        Modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    ) {
                        Text("Hello there!", style = MaterialTheme.typography.headlineLarge)
                        Text(
                            "This is a sample Jetpack Compose App!",
                            style = MaterialTheme.typography.bodyMedium
                        )
                        //                Image(
                        //                    painterResource(R.drawable.avatar),
                        //                    contentDescription = "",
                        //                    modifier = Modifier.size(50.dp)
                        //                )
                    }
                }
                Spacer(modifier = Modifier.height(25.dp))
                Text(text = "This is supposed to be the body.", style = MaterialTheme.typography.bodyMedium)
                Spacer(modifier = Modifier.height(25.dp))
                var text by remember { mutableStateOf(TextFieldValue("")) }
                TextField(
                    value = text,
                    onValueChange = { newText ->
                        text = newText
                    },
                    label = { Text("Enter some text!") },
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    onClick = {
                        Toast.makeText(ctx, text.text, Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text("Click me!")
                }
            }
        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyComposeApp()
}
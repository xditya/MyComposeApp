package me.xditya.mycomposeapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import compose.icons.FontAwesomeIcons
import compose.icons.fontawesomeicons.Brands
import compose.icons.fontawesomeicons.brands.Chrome
import compose.icons.fontawesomeicons.brands.Github
import compose.icons.fontawesomeicons.brands.Youtube
import me.xditya.mycomposeapp.R
import me.xditya.mycomposeapp.navigation.CustomBottomAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InfoScreen(
    navController: NavController
) {
    val uriHandler = LocalUriHandler.current
    Scaffold(
        bottomBar = {
            CustomBottomAppBar(navController = navController)
        }
    ) {
        Surface(
            modifier = Modifier.padding(it)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "my_logo",
                    modifier = Modifier
                        .padding(16.dp)
                        .clip(shape = CircleShape)
                        .size(150.dp),
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    "Aditya",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight(500)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row {
                    IconButton(onClick = {
                        uriHandler.openUri("https://github.com/xditya")
                    }) {
                        Icon(
                            imageVector = FontAwesomeIcons.Brands.Github,
                            contentDescription = "GitHub",
                            modifier = Modifier.size(35.dp),
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    IconButton(onClick = {
                        uriHandler.openUri("https://xditya.me")
                    }) {
                        Icon(
                            imageVector = FontAwesomeIcons.Brands.Chrome,
                            contentDescription = "Website",
                            modifier = Modifier.size(35.dp),
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    IconButton(onClick = {
                        uriHandler.openUri("https://youtube.com/@xditya")
                    }) {
                        Icon(
                            imageVector = FontAwesomeIcons.Brands.Youtube,
                            contentDescription = "YouTube",
                            modifier = Modifier.size(35.dp),
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun GenPreview() {
    InfoScreen(navController = NavController(LocalContext.current))
}
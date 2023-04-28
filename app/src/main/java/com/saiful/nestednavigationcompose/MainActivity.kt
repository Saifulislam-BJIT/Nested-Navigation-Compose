package com.saiful.nestednavigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.saiful.nestednavigationcompose.navigation.navGraph.SetupNavHost
import com.saiful.nestednavigationcompose.screen.HomeScreen
import com.saiful.nestednavigationcompose.ui.theme.NestedNavigationComposeTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NestedNavigationComposeTheme {
                navController = rememberNavController()
                SetupNavHost(navController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NestedNavigationComposeTheme {
        HomeScreen(navController = rememberNavController())
    }
}
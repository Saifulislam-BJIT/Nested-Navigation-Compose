package com.saiful.nestednavigationcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.saiful.nestednavigationcompose.navigation.Screen

@Composable
fun SignUpScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Signup Screen",
            modifier = Modifier
                .clip(RoundedCornerShape(16.dp))
                .background(Color.Yellow)
                .padding(8.dp)
                .clickable {
                    navController.navigate(Screen.LogIn.route)
                },
            fontSize = 36.sp
        )

        Text(
            text = "Auth Graph",
            modifier = Modifier
                .padding(top = 24.dp)
                .border(1.dp, Color.DarkGray, shape = RoundedCornerShape(8.dp))
                .padding(8.dp),
            fontSize = 36.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SingUpScreenPreview() {
    SignUpScreen(navController = rememberNavController())
}
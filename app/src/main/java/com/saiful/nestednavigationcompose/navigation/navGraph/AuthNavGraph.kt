package com.saiful.nestednavigationcompose.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.saiful.nestednavigationcompose.navigation.Screen
import com.saiful.nestednavigationcompose.screen.LoginScreen
import com.saiful.nestednavigationcompose.screen.SignUpScreen
import com.saiful.nestednavigationcompose.utils.AUTH_GRAPH_ROUTE

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.LogIn.route,
        route = AUTH_GRAPH_ROUTE
    ) {
        composable(Screen.LogIn.route) { LoginScreen(navController) }
        composable(Screen.SignUp.route) { SignUpScreen(navController) }
    }
}
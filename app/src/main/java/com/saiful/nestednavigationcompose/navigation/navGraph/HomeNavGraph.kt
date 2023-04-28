package com.saiful.nestednavigationcompose.navigation.navGraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.saiful.nestednavigationcompose.navigation.Screen
import com.saiful.nestednavigationcompose.screen.DetailsScreen
import com.saiful.nestednavigationcompose.screen.HomeScreen
import com.saiful.nestednavigationcompose.utils.HOME_GRAPH_ROUTE

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(Screen.Home.route) { HomeScreen(navController) }
        composable(Screen.Details.route) { DetailsScreen(navController) }
    }
}
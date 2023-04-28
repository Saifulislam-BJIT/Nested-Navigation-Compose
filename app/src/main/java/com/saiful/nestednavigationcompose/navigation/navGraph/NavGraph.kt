package com.saiful.nestednavigationcompose.navigation.navGraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.saiful.nestednavigationcompose.utils.HOME_GRAPH_ROUTE
import com.saiful.nestednavigationcompose.utils.ROOT_GRAPH_ROUTE

@Composable
fun SetupNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_GRAPH_ROUTE,
        route = ROOT_GRAPH_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}
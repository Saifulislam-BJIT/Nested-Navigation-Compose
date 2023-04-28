package com.saiful.nestednavigationcompose.navigation

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Details : Screen(route = "details_screen")
    object LogIn : Screen(route = "log_in_screen")
    object SignUp : Screen(route = "sign_up_screen")
}

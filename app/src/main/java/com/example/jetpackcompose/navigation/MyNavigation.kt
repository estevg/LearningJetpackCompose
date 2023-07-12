package com.example.jetpackcompose.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

sealed class Screen(val route: String) {
    object Screen1 : Screen(route = "screen1")
    object Screen2 : Screen(route = "screen2")
    object Screen3 : Screen(route = "screen3")
    object Screen4 : Screen(route = "screen4/{age}") {
        fun createRout(age: Int) = "screen4/$age"
    }

    object Screen5 : Screen(route = "screen5?name={name}") {
        fun createRout(name: String) = "screen5?name=$name"
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Screen1.route) {
        composable(Screen.Screen1.route) {
            MyScreen(navController)
        }
        composable(Screen.Screen2.route) {
            MyScreen2(navController)
        }
        composable(Screen.Screen3.route) {
            MyScreen3(navController)
        }

        // Valores obligatorios
        composable(Screen.Screen4.route, arguments = listOf(navArgument("age") {
            type = NavType.IntType
        })) { navBackStackEntry ->

            navBackStackEntry.arguments?.getInt("age")?.let { name ->
                MyScreen4(navController, name)
            }
        }

        // Valores opcionales
        composable(
            Screen.Screen5.route,
            arguments = listOf(navArgument("name") { defaultValue = "Elliot" })
        ) { navBackStackEntry ->

            MyScreen5(navController, navBackStackEntry.arguments?.getString("name") ?: "")

        }
    }
}

@Composable
fun MyScreen(navController: NavHostController) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Red)
    ) {
        Text(
            text = "Pantalla 1",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Screen.Screen2.route) })
    }
}

@Composable
fun MyScreen2(navController: NavHostController) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {
        Text(text = "Pantalla 2", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navController.navigate(Screen.Screen3.route) })
    }
}

@Composable
fun MyScreen3(navController: NavHostController) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(
            text = "Pantalla 3",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Screen.Screen4.createRout(4)) })
    }
}

@Composable
fun MyScreen4(navController: NavHostController, age: Int) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(text = "Tengo $age año", modifier = Modifier
            .align(Alignment.Center)
            .clickable { navController.navigate(Screen.Screen5.route) })
    }
}


@Composable
fun MyScreen5(navController: NavHostController, name: String?) {
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(text = "Me llamo $name", modifier = Modifier.align(Alignment.Center))
    }
}


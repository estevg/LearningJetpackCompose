package com.example.jetpackcompose.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.jetpackcompose.screen.data.findFruit

@Composable
fun FruitDetailScreen(navController: NavHostController, id: Int) {
    val fruit = findFruit(id)
    if (fruit != null) {
        Text(text = fruit.name)
    } else {
        navController.popBackStack()
    }
}



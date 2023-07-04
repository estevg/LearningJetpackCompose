package com.example.jetpackcompose.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.Screen
import com.example.jetpackcompose.screen.data.Fruit
import com.example.jetpackcompose.screen.data.fruitList

@Composable
fun FruitScreen(navController: NavHostController) {
    LazyColumn {
        items(fruitList) { fruit ->
            FruitItem(fruit) {
                navController.navigate(Screen.FruitDetailScreen.route + "/${fruit.id}")
            }
        }
    }
}

@Composable
fun FruitItem(fruit: Fruit, onFruitClick: (fruit: Fruit) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
        Text(text = fruit.name, modifier = Modifier
            .padding(4.dp)
            .clickable { onFruitClick(fruit) })
    }
    Divider()
}

@Preview(showBackground = true)
@Composable
private fun FruitItemPreview() {
    FruitScreen(navController = rememberNavController())
}

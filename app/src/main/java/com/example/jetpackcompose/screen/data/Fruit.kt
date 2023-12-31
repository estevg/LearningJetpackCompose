package com.example.jetpackcompose.screen.data

data class Fruit(val id: Int, val name: String)


val fruitList = listOf(
    Fruit(0, "Orange"),
    Fruit(1, "Apple"),
    Fruit(2, "Banana"),
    Fruit(3, "Grape"),
)

fun findFruit(id: Int) =  fruitList[id]
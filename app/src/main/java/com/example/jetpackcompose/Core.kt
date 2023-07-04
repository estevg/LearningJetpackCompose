package com.example.jetpackcompose

import androidx.annotation.DrawableRes

data class Message(val author: String, val body: String)

data class Recipe(
    @DrawableRes val imageResource: Int,
    val title: String,
    val ingredients: List<String>
)

val recipesList = listOf(
    Recipe(
        R.mipmap.header,
        "Pizza",
        listOf(
            "Harina",
            "Agua",
            "Levadura",
            "Sal",
            "Salsa de tomate",
            "Queso",
            "Jamón",
            "Pepperoni",
            "Champiñones",
            "Aceitunas"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Hamburguesa",
        listOf(
            "Pan de hamburguesa",
            "Carne molida",
            "Queso",
            "Lechuga",
            "Tomate",
            "Cebolla",
            "Mayonesa",
            "Kétchup",
            "Mostaza",
            "Pepinillos"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Sopa de pollo",
        listOf(
            "Pollo",
            "Caldo de pollo",
            "Zanahorias",
            "Apio",
            "Cebolla",
            "Ajo",
            "Fideos",
            "Sal",
            "Pimienta",
            "Especias"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Espaguetis a la boloñesa",
        listOf(
            "Espaguetis",
            "Carne molida",
            "Salsa de tomate",
            "Cebolla",
            "Ajo",
            "Zanahoria",
            "Apio",
            "Aceite de oliva",
            "Sal",
            "Pimienta"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Sushi",
        listOf(
            "Arroz para sushi",
            "Algas nori",
            "Pescado fresco (salmón, atún, etc.)",
            "Aguacate",
            "Pepino",
            "Salsa de soja",
            "Wasabi",
            "Jengibre encurtido",
            "Vinagre de arroz",
            "Azúcar"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Filete de ternera",
        listOf(
            "Filete de ternera",
            "Mantequilla",
            "Ajo",
            "Tomillo",
            "Sal",
            "Pimienta",
            "Aceite de oliva",
            "Patatas",
            "Verduras al vapor",
            "Salsa de tu elección"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Tacos de pollo",
        listOf(
            "Tortillas de maíz",
            "Pollo desmenuzado",
            "Cebolla",
            "Cilantro",
            "Salsa de tomate",
            "Aguacate",
            "Queso rallado",
            "Limón",
            "Sal",
            "Pimienta"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Curry de pollo",
        listOf(
            "Pollo",
            "Cebolla",
            "Pimiento",
            "Jengibre",
            "Ajo",
            "Leche de coco",
            "Curry en polvo",
            "Cúrcuma",
            "Comino",
            "Cilantro"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Pastel de chocolate",
        listOf(
            "Harina",
            "Azúcar",
            "Cacao en polvo",
            "Huevos",
            "Leche",
            "Aceite vegetal",
            "Levadura en polvo",
            "Esencia de vainilla",
            "Sal",
            "Crema batida"
        )
    ),
    Recipe(
        R.mipmap.header,
        "Ensalada César",
        listOf(
            "Lechuga romana",
            "Pollo a la parrilla",
            "Pan tostado",
            "Queso parmesano",
            "Aderezo César",
            "Anchoas",
            "Aceite de oliva",
            "Ajo",
            "Mostaza Dij"
        )
    )
)

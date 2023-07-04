package com.example.jetpackcompose.components

import android.util.Log
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.Recipe
import com.example.jetpackcompose.recipesList

@Composable
fun RecipeColumListHorizontal(recipeList: List<Recipe>) {
    LazyRow {
        items(recipeList) { recipe ->
            RecipeCard(recipe = recipe, onRecipeClick = {
                Log.d("CLICK", "RecipeColumListHorizontal: ${recipe.title}")
            })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHorizontalList() {
    RecipeColumListHorizontal(recipesList)
}

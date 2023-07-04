package com.example.jetpackcompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.Recipe
import com.example.jetpackcompose.recipesList

@Composable
fun RecipeCard(recipe: Recipe, onRecipeClick: (recipe: Recipe) -> Unit) {
    val image = painterResource(id = R.mipmap.header)

    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 9.dp,
        modifier = Modifier
            .padding(8.dp)
            .clickable { onRecipeClick(recipe) }) {

        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            val imageModifier = Modifier
                .requiredHeight(150.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(10.dp))

            Image(
                painter = image,
                modifier = imageModifier,
                contentScale = ContentScale.Crop,
                contentDescription = "Imagen"
            )



            Spacer(modifier = Modifier.padding(top = 10.dp))

            Text(recipe.title, style = MaterialTheme.typography.h6)

            for (ingredient in recipe.ingredients) {
                Text(
                    text = "* $ingredient",
                    style = MaterialTheme.typography.body2,
                )
            }

        }
    }
}

@Preview
@Composable
fun PreviewRecipeCard() {
    RecipeCard(recipesList[0]) {}
}
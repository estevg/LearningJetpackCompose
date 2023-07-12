package com.example.jetpackcompose.jetpackComposeCatalago.recyclerView

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpackcompose.R
import com.example.jetpackcompose.SuperHero
import kotlinx.coroutines.launch

@Composable
fun SimpleRecyclerView() {
    val names = listOf("Eeteban", "lou", "ska", "ted")
    LazyColumn {
        item { Text(text = "Header") }
        items(7) {
            Text(text = "Este es el item $it")
        }

        items(names) {
            Text(text = "Este es el item $it")
        }
    }
}

@Composable
fun RecyclerViewWithState() {
    val context = LocalContext.current
    val rvState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    Column {
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.weight(1f),
            state = rvState
        ) {
            items(getSuperHero()) { superHero ->
                ItemHero(superHero) {
                    Toast.makeText(context, it.superheroName, Toast.LENGTH_SHORT).show()
                }
            }
        }

        val showButton by remember {
            derivedStateOf {
                rvState.firstVisibleItemIndex > 0
            }
        }

        if (showButton) {
            Button(
                onClick = {
                    coroutineScope.launch {
                        rvState.animateScrollToItem(0)
                    }
                }, modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(8.dp)
            ) {
                Text(text = "EL BOTON")
            }
        }


    }


}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun RecyclerViewWithHeader() {
    val context = LocalContext.current

    val superHero = getSuperHero().groupBy { it.publisher }

    LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {


        superHero.forEach { (publisher, mySuperHero) ->


            stickyHeader {
                Text(
                    text = publisher,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Green),
                    color = Color.White,
                    fontSize = 16.sp
                )
            }

            items(mySuperHero) { superHero ->
                ItemHero(superHero) {
                    Toast.makeText(context, it.superheroName, Toast.LENGTH_SHORT).show()
                }
            }
        }


    }
}


@Composable
fun SuperHeroGrid() {
    val context = LocalContext.current
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 20.dp)
    ) {
        items(getSuperHero()) { superHero ->
            ItemHero(superHero) {
                Toast.makeText(context, it.superheroName, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

@Composable
fun SuperHeroView() {
    val context = LocalContext.current
    LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        items(getSuperHero()) { superHero ->
            ItemHero(superHero) {
                Toast.makeText(context, it.superheroName, Toast.LENGTH_SHORT).show()
            }
        }
    }
}

@Composable
fun ItemHero(superhero: SuperHero, onItemSelected: (SuperHero) -> Unit) {
    Card(border = BorderStroke(2.dp, Color.Red), modifier = Modifier
        // .width(200.dp)
        .fillMaxWidth()
        .clickable { onItemSelected(superhero) }) {
        Column() {
            Image(
                painter = painterResource(id = superhero.photo),
                contentDescription = superhero.realName,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = superhero.superheroName,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)
            )
            Text(
                text = superhero.superheroName,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp),
                fontSize = 10.sp
            )

        }
    }
}


fun getSuperHero(): List<SuperHero> {
    return listOf(
        SuperHero("Spiderman", "Petter Parker", "Marvel", R.drawable.spiderman),
        SuperHero("Wolverin", "Marvel", "DC", R.drawable.logan),
        SuperHero("Spiderman", "Petter Parker", "Marvel", R.drawable.batman),
        SuperHero("Batman", "Petter Parker", "DC", R.drawable.thor),
        SuperHero("Flash", "Petter Parker", "DC", R.drawable.flash),
        SuperHero("Green Lantern", "Petter Parker", "Marvel", R.drawable.green_lantern),
        SuperHero("Wonder Woman", "Petter Parker", "DC", R.drawable.wonder_woman),

        )
}


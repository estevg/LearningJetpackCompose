package com.example.jetpackcompose.jetpackComposeCatalago.layouts

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Snackbar
import androidx.compose.material.SnackbarHost
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dangerous
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun ScaffoldExample() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    //  val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        topBar = {
            MyTopAppBar(onClickIcon = {
                coroutineScope.launch {
                    scaffoldState.snackbarHostState.showSnackbar("Has pulsado $it")
                    //snackbarHostState.showSnackbar("Has pulsado $it")
                }
            }, onClickDrawer = {
                coroutineScope.launch {
                    scaffoldState.drawerState.open()
                }
            })
        },
        snackbarHost = {
            SnackbarHost(it) { data ->
                // custom snackbar with the custom border
                Snackbar(
                    modifier = Modifier.border(2.dp, MaterialTheme.colors.secondary),
                    snackbarData = data
                )
            }
        },
        scaffoldState = scaffoldState,
        bottomBar = { MyBottomNavigation3() },
        floatingActionButton = { MyFAB() },
        floatingActionButtonPosition = FabPosition.End,
        isFloatingActionButtonDocked = false,
        drawerContent = { MyDrawer(){
            coroutineScope.launch {
                scaffoldState.drawerState.close()
            }
        } }
    ) { contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)) { /* ... */ }
    }
}

@Composable
fun MyTopAppBar(onClickIcon: (String) -> Unit, onClickDrawer: () -> Unit) {
    TopAppBar(
        title = { Text(text = "Mi primer TopAppBar") },
        backgroundColor = Color.Red,
        contentColor = Color.White,
        elevation = 4.dp,
        navigationIcon = {
            IconButton(onClick = { onClickDrawer() }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = { onClickIcon("Buscar") }) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Buscar")
            }

            IconButton(onClick = { onClickIcon("Error") }) {
                Icon(imageVector = Icons.Default.Dangerous, contentDescription = "Error")
            }
        }
    )
}

@Composable
fun MyBottomNavigation() {
    BottomNavigation {
        BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(imageVector = Icons.Default.Home, contentDescription = "HOME")
        })
        BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "SEARCH")
        })
        BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {
            Icon(imageVector = Icons.Default.Star, contentDescription = "START")
        })
    }
}

@Composable
fun MyBottomNavigation3() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Songs", "Artists", "Playlists")

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(Icons.Filled.Favorite, contentDescription = item) },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}

@Composable
fun MyFAB() {
    FloatingActionButton(onClick = { /*TODO*/ }, backgroundColor = Color.Yellow) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "Add")
    }
}

@Composable
fun MyDrawer(onCloseDrawer: () -> Unit) {
    Column(Modifier.padding(8.dp)) {
        Text(text = "Primera opcion", modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp).clickable { onCloseDrawer() })
        Text(text = "Segunda opcion", modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp).clickable { onCloseDrawer() })
        Text(text = "Tercera opcion", modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp).clickable { onCloseDrawer() })
        Text(text = "Cuarta opcion", modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp).clickable { onCloseDrawer() })
        Text(text = "Quita opcion", modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp).clickable { onCloseDrawer() })

    }
}
package com.example.jetpackcompose.jetpackComposeCatalago


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Pageview
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBadgeBox() {
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            BadgedBox(
                badge = {
                    Badge {
                        val badgeNumber = "1000"
                        Text(
                            badgeNumber,
                            modifier = Modifier.semantics {
                                contentDescription = "$badgeNumber new notifications"
                            }
                        )
                    }
                }) {
                Icon(
                    Icons.Filled.Star,
                    contentDescription = "Favorite"
                )
            }

            BadgedBox(
                badge = {
                    Badge {
                        val badgeNumber = "20"
                        Text(
                            badgeNumber,
                            modifier = Modifier.semantics {
                                contentDescription = "$badgeNumber new notifications"
                            }
                        )
                    }
                }) {
                Icon(
                    Icons.Filled.Search,
                    contentDescription = "Favorite"
                )
            }

            BadgedBox(
                badge = {
                    Badge(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    ) {
                        val badgeNumber = "10"
                        Text(
                            badgeNumber,
                            modifier = Modifier.semantics {
                                contentDescription = "$badgeNumber new notifications"
                            }
                        )
                    }
                }) {
                Icon(
                    Icons.Filled.Notifications,
                    contentDescription = "Favorite"
                )
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMyBadgeBox() {
    MyBadgeBox()
}
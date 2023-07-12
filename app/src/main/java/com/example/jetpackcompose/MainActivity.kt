package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackcompose.instagram.Login
import com.example.jetpackcompose.jetpackComposeCatalago.layouts.ScaffoldExample
import com.example.jetpackcompose.jetpackComposeCatalago.recyclerView.RecyclerViewWithHeader
import com.example.jetpackcompose.jetpackComposeCatalago.recyclerView.RecyclerViewWithState
import com.example.jetpackcompose.jetpackComposeCatalago.recyclerView.SimpleRecyclerView
import com.example.jetpackcompose.jetpackComposeCatalago.recyclerView.SuperHeroGrid
import com.example.jetpackcompose.jetpackComposeCatalago.recyclerView.SuperHeroView
import com.example.jetpackcompose.twitter.TwitterScreen


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /* var myText by remember {
                 mutableStateOf("Esteban")
             }
             MyTextField(myText){ myText = it }*/

            /*
            val myOptions = getOptions(listOf("Hola", "Hola", "Hola"))
            Column {
                            MyCheckBoxThreeState()
                            myOptions.forEach {
                                MyCheckBoxWithStateHosting(it)
                            }
                        }
                        */

            /*
              var selected by rememberSaveable {
                  mutableStateOf("Esteban")
              }

              MyRadioButtonWithState(selected) { selected = it }
            */

           /* var show by rememberSaveable {
                mutableStateOf(false)
            }

            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Button(onClick = { show = true }) {
                    Text(text = "Press Here")
                }
                MyConfirmationDialog(show) { show = false }

            }*/

            ScaffoldExample()


        }
    }

}



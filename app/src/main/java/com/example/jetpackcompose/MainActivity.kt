package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackcompose.instagram.ui.Login
import com.example.jetpackcompose.instagram.ui.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val loginViewModel: LoginViewModel by viewModels()

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

            Login(loginViewModel)


        }
    }

}



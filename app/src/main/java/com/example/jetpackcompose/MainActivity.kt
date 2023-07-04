package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackcompose.jetpackComposeCatalago.MyProgressBarAdvanced


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           /* var myText by remember {
                mutableStateOf("Esteban")
            }
            MyTextField(myText){ myText = it }*/
           // MyProgressBarAdvanced()
        }
    }

}



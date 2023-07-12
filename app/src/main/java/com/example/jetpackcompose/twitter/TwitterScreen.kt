package com.example.jetpackcompose.twitter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

@Composable
fun TwitterScreen() {
    Box(
        Modifier
            .background(Color(0xFF171f2b))
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Row(Modifier.fillMaxWidth()) {
            ImageProfile()
            BodyTweet()
        }
    }
}


@Composable
fun ImageProfile() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "Test",
        modifier = Modifier
            .clip(CircleShape)
            .size(55.dp)

    )
}

@Composable
fun BodyTweet() {
    Column(
        Modifier
            .fillMaxWidth()
            .padding(start = 10.dp)
    ) {
        Row(Modifier.fillMaxWidth()) {
            CustomText(text = "Esteban", fontWeight = FontWeight.Bold, color = Color.White)
            CustomText(
                text = "@elliotvg",
                color = Color(0xFF82868f),
                modifier = Modifier.padding(start = 10.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painterResource(id = R.drawable.ic_dots),
                contentDescription = null,
                tint = Color.White
            )
        }

        CustomText("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen.")
        Spacer(modifier = Modifier.size(20.dp))
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .size(220.dp)
                .clip(RoundedCornerShape(25.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.size(20.dp))
        IconActions()
    }
}

@Composable
fun IconActions() {

    var chat by rememberSaveable {
        mutableStateOf(false)
    }

    var rt by rememberSaveable {
        mutableStateOf(false)
    }

    var like by rememberSaveable {
        mutableStateOf(false)
    }

    Row(Modifier.fillMaxWidth()) {
        SocialMediaIcon(
            Modifier.weight(1f),
            icon = {
                Icon(
                    painterResource(
                        id = if (chat) {
                            R.drawable.ic_chat_filled
                        } else {
                            R.drawable.ic_chat
                        }
                    ),
                    contentDescription = "",
                    tint = if (chat) {
                        Color.White
                    } else {
                        Color(0xFF8a919d)
                    }
                )
            },
            { chat = !chat })
        SocialMediaIcon(
            Modifier.weight(1f),
            icon = {
                Icon(
                    painterResource(id = R.drawable.ic_rt),
                    contentDescription = "",
                    tint = if (rt) {
                        Color(0xFF00FF27)
                    } else {
                        Color(0xFF8a919d)
                    }
                )
            },
            { rt = !rt })
        SocialMediaIcon(
            Modifier.weight(1f),
            icon = {
                Icon(
                    painterResource(
                        id = if (like) {
                            R.drawable.ic_like_filled
                        } else {
                            R.drawable.ic_like
                        }
                    ),
                    contentDescription = "",
                    tint = if (like) {
                        Color(0xFFFF0000)
                    } else {
                        Color(0xFF8a919d)
                    },
                )
            },
            { like = !like })
    }
}

@Composable
fun SocialMediaIcon(
    modifier: Modifier,
    icon: @Composable () -> Unit,
    onItemSelect: () -> Unit
) {
    Row(
        modifier = modifier.noRippleClickable { onItemSelect() },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        icon()
        Text(text = "1", color = Color.White, modifier = Modifier.padding(horizontal = 5.dp))
    }

}

fun Modifier.noRippleClickable(onClick: () -> Unit): Modifier = composed {
    clickable(indication = null,
        interactionSource = remember { MutableInteractionSource() }) {
        onClick()
    }
}

@Composable
fun CustomText(
    text: String,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = Color.White,
    modifier: Modifier = Modifier
) {
    Text(text = text, fontWeight = fontWeight, color = color, modifier = modifier, maxLines = 5)
}

@Preview(showBackground = true)
@Composable
fun PreviewTwitter() {
    TwitterScreen()
}
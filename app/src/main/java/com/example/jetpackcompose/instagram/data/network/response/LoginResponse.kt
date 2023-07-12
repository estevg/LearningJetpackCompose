package com.example.jetpackcompose.instagram.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("success")
    val success: Boolean
)

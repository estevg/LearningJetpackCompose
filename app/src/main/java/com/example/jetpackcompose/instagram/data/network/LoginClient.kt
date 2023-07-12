package com.example.jetpackcompose.instagram.data.network

import com.example.jetpackcompose.instagram.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    @GET("/v3/7f548977-c851-4a15-8f4c-fb54c54f80a7")
    suspend fun doLogin(): Response<LoginResponse>
}
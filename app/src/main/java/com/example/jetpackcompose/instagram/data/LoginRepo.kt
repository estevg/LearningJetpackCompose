package com.example.jetpackcompose.instagram.data

import com.example.jetpackcompose.instagram.data.network.LoginServices

class LoginRepo {
    private val api = LoginServices()

    suspend fun doLogin(user: String, password: String): Boolean {
       return api.doLogin()
    }
}
package com.example.jetpackcompose.instagram.data

import com.example.jetpackcompose.instagram.data.network.LoginServices
import javax.inject.Inject

class LoginRepo @Inject constructor(private val api: LoginServices) {
    suspend fun doLogin(): Boolean {
        return api.doLogin()
    }
}
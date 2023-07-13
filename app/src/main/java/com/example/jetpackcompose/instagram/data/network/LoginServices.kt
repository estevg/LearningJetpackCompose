package com.example.jetpackcompose.instagram.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoginServices @Inject constructor(private val loginClient: LoginClient) {
    suspend fun doLogin(): Boolean {
        return withContext(Dispatchers.IO) {
            val response = loginClient.doLogin()
            response.body()?.success ?: false
        }
    }

}
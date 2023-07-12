package com.example.jetpackcompose.instagram.data.network

import com.example.jetpackcompose.instagram.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginServices {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(): Boolean {
       return withContext(Dispatchers.IO) {
            val response = retrofit.create(LoginClient::class.java).doLogin()
            response.body()?.success ?: false
        }
    }

}
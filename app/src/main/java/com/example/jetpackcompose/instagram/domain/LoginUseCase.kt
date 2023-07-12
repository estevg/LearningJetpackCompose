package com.example.jetpackcompose.instagram.domain

import android.util.Log
import com.example.jetpackcompose.instagram.data.LoginRepo

class LoginUseCase {

    private val repository = LoginRepo()

    suspend operator fun invoke(user: String, password: String): Boolean {
        Log.d("HIIIII", "TEST")
       return repository.doLogin(user, password)
    }
}
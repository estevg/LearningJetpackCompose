package com.example.jetpackcompose.instagram.domain

import android.util.Log
import com.example.jetpackcompose.instagram.data.LoginRepo
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: LoginRepo) {
    suspend operator fun invoke(): Boolean {
        return repository.doLogin()
    }
}
package com.example.jetpackcompose.instagram.ui

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {


    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email


    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _enabled = MutableLiveData<Boolean>()
    val enabled: LiveData<Boolean> = _enabled


    fun onLoginChange(email: String, password: String) {
        _email.value = email
        _password.value = password
        _enabled.value = enabledLogin(email, password)
    }

    fun enabledLogin(email: String, password: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6
    }
}
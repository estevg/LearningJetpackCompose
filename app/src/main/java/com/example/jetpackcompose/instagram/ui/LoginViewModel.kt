package com.example.jetpackcompose.instagram.ui

import android.util.Log
import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.jetpackcompose.instagram.domain.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val loginUseCase: LoginUseCase): ViewModel() {


    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email


    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _enabled = MutableLiveData<Boolean>()
    val enabled: LiveData<Boolean> = _enabled

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean> = _loading


    fun onLoginChange(email: String, password: String) {
        _email.value = email
        _password.value = password
        _enabled.value = enabledLogin(email, password)

    }

    private fun enabledLogin(email: String, password: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches() && password.length > 6
    }

    fun onLoginSelected() {
        Log.d("HIIIII", "holaaaa 3")
        viewModelScope.launch {


            val result = loginUseCase()
            Log.d("HIIIII", "TEST, $result")
            if (result) {
                _loading.value = true
                Log.d("HIIIII", "holaaaa 2")
            }
        }
    }
}
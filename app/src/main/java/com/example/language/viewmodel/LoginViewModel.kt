package com.example.language.viewmodel

import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    fun isValidCredentials(username: String, password: String): Boolean {
        return username.isNotBlank() && password.length >= 6
    }
}

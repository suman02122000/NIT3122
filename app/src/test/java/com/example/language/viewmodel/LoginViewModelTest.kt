package com.example.language.viewmodel

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class LoginViewModelTest {

    private lateinit var viewModel: LoginViewModel

    @Before
    fun setup() {
        viewModel = LoginViewModel()
    }

    @Test
    fun `valid username and password returns true`() {
        val result = viewModel.isValidCredentials("john", "123456")
        assertTrue(result)
    }

    @Test
    fun `blank username returns false`() {
        val result = viewModel.isValidCredentials("", "123456")
        assertFalse(result)
    }

    @Test
    fun `short password returns false`() {
        val result = viewModel.isValidCredentials("john", "123")
        assertFalse(result)
    }
}

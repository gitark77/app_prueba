package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.repository.AuthRepository

class AuthViewModel(private val authRepository: AuthRepository) : ViewModel() {

    fun getCurrentUser() = authRepository.getCurrentUser()

    fun signInWithEmailAndPassword(email: String, pass: String) = authRepository.signInWithEmailAndPassword(email, pass)

    fun createUserWithEmailAndPassword(email: String, pass: String) = authRepository.createUserWithEmailAndPassword(email, pass)

    fun signOut() = authRepository.signOut()
}
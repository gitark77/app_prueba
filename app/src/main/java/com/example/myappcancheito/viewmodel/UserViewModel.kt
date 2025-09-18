package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.model.Usuario
import com.example.myappcancheito.repository.UserRepository

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun saveUser(usuario: Usuario) = userRepository.saveUser(usuario)

    fun getUser(uid: String) = userRepository.getUser(uid)
}
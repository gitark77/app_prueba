package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.model.Empleador
import com.example.myappcancheito.repository.EmpleadorRepository

class EmpleadorViewModel(private val empleadorRepository: EmpleadorRepository) : ViewModel() {

    fun saveEmpleador(empleador: Empleador) = empleadorRepository.saveEmpleador(empleador)

    fun getEmpleador(uid: String) = empleadorRepository.getEmpleador(uid)
}
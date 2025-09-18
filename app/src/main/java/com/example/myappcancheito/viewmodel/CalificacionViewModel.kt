package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.model.Calificacion
import com.example.myappcancheito.repository.CalificacionRepository

class CalificacionViewModel(private val calificacionRepository: CalificacionRepository) : ViewModel() {

    fun saveCalificacion(calificacion: Calificacion) = calificacionRepository.saveCalificacion(calificacion)

    fun getCalificaciones(evaluadoUid: String) = calificacionRepository.getCalificaciones(evaluadoUid)
}
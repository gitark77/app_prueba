package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.model.Postulante
import com.example.myappcancheito.repository.PostulanteRepository

class PostulanteViewModel(private val postulanteRepository: PostulanteRepository) : ViewModel() {

    fun savePostulante(postulante: Postulante) = postulanteRepository.savePostulante(postulante)

    fun getPostulante(uid: String) = postulanteRepository.getPostulante(uid)
}
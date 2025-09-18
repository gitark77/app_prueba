package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.model.Postulacion
import com.example.myappcancheito.repository.PostulacionRepository

class PostulacionViewModel(private val postulacionRepository: PostulacionRepository) : ViewModel() {

    fun savePostulacion(postulacion: Postulacion) = postulacionRepository.savePostulacion(postulacion)

    fun getPostulacionesPorOferta(ofertaId: String) = postulacionRepository.getPostulacionesPorOferta(ofertaId)

    fun getPostulacionesPorPostulante(postulanteUid: String) = postulacionRepository.getPostulacionesPorPostulante(postulanteUid)
}
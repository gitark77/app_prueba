package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.model.Oferta
import com.example.myappcancheito.repository.OfertaRepository

class OfertaViewModel(private val ofertaRepository: OfertaRepository) : ViewModel() {

    fun saveOferta(oferta: Oferta) = ofertaRepository.saveOferta(oferta)

    fun getOferta(id: String) = ofertaRepository.getOferta(id)

    fun getOfertas() = ofertaRepository.getOfertas()
}
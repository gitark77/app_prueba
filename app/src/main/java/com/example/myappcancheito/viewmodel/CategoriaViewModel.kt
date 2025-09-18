package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import com.example.myappcancheito.model.Categoria
import com.example.myappcancheito.repository.CategoriaRepository

class CategoriaViewModel(private val categoriaRepository: CategoriaRepository) : ViewModel() {

    fun saveCategoria(categoria: Categoria) = categoriaRepository.saveCategoria(categoria)

    fun getCategorias() = categoriaRepository.getCategorias()
}
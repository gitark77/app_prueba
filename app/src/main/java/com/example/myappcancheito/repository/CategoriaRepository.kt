package com.example.myappcancheito.repository

import com.example.myappcancheito.model.Categoria
import com.google.firebase.database.FirebaseDatabase

class CategoriaRepository {

    private val database = FirebaseDatabase.getInstance().getReference("categorias")

    fun saveCategoria(categoria: Categoria) = database.child(categoria.id).setValue(categoria)

    fun getCategorias() = database.get()
}
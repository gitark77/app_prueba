package com.example.myappcancheito.repository

import com.example.myappcancheito.model.Oferta
import com.google.firebase.database.FirebaseDatabase

class OfertaRepository {

    private val database = FirebaseDatabase.getInstance().getReference("ofertas")

    fun saveOferta(oferta: Oferta) = database.child(oferta.id).setValue(oferta)

    fun getOferta(id: String) = database.child(id).get()

    fun getOfertas() = database.get()
}
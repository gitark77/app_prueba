package com.example.myappcancheito.repository

import com.example.myappcancheito.model.Postulante
import com.google.firebase.database.FirebaseDatabase

class PostulanteRepository {

    private val database = FirebaseDatabase.getInstance().getReference("postulantes")

    fun savePostulante(postulante: Postulante) = database.child(postulante.uid).setValue(postulante)

    fun getPostulante(uid: String) = database.child(uid).get()
}
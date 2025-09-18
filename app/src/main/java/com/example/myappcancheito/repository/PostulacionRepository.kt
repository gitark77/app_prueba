package com.example.myappcancheito.repository

import com.example.myappcancheito.model.Postulacion
import com.google.firebase.database.FirebaseDatabase

class PostulacionRepository {

    private val database = FirebaseDatabase.getInstance().getReference("postulaciones")

    fun savePostulacion(postulacion: Postulacion) = database.child(postulacion.id).setValue(postulacion)

    fun getPostulacionesPorOferta(ofertaId: String) = database.orderByChild("ofertaId").equalTo(ofertaId).get()

    fun getPostulacionesPorPostulante(postulanteUid: String) = database.orderByChild("postulanteUid").equalTo(postulanteUid).get()
}
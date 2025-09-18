package com.example.myappcancheito.repository

import com.example.myappcancheito.model.Calificacion
import com.google.firebase.database.FirebaseDatabase

class CalificacionRepository {

    private val database = FirebaseDatabase.getInstance().getReference("calificaciones")

    fun saveCalificacion(calificacion: Calificacion) = database.child(calificacion.id).setValue(calificacion)

    fun getCalificaciones(evaluadoUid: String) = database.orderByChild("evaluadoUid").equalTo(evaluadoUid).get()
}
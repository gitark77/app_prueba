package com.example.myappcancheito.repository

import com.example.myappcancheito.model.Empleador
import com.google.firebase.database.FirebaseDatabase

class EmpleadorRepository {

    private val database = FirebaseDatabase.getInstance().getReference("empleadores")

    fun saveEmpleador(empleador: Empleador) = database.child(empleador.uid).setValue(empleador)

    fun getEmpleador(uid: String) = database.child(uid).get()
}
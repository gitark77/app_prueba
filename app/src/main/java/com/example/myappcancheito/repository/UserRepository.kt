package com.example.myappcancheito.repository

import com.example.myappcancheito.model.Usuario
import com.google.firebase.database.FirebaseDatabase

class UserRepository {

    private val database = FirebaseDatabase.getInstance().getReference("usuarios")

    fun saveUser(usuario: Usuario) = database.child(usuario.uid).setValue(usuario)

    fun getUser(uid: String) = database.child(uid).get()
}
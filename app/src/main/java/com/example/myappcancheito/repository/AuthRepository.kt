package com.example.myappcancheito.repository

import com.google.firebase.auth.FirebaseAuth

class AuthRepository {

    private val firebaseAuth = FirebaseAuth.getInstance()

    fun getCurrentUser() = firebaseAuth.currentUser

    fun signInWithEmailAndPassword(email: String, pass: String) = firebaseAuth.signInWithEmailAndPassword(email, pass)

    fun createUserWithEmailAndPassword(email: String, pass: String) = firebaseAuth.createUserWithEmailAndPassword(email, pass)

    fun signOut() = firebaseAuth.signOut()
}
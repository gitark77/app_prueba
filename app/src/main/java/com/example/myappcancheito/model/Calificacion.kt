package com.example.myappcancheito.model

data class Calificacion(
    val id: String = "",
    val evaluadorUid: String = "",
    val evaluadoUid: String = "",
    val puntuacion: Int = 0,
    val comentario: String = ""
)
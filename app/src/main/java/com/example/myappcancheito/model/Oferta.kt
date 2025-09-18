package com.example.myappcancheito.model

data class Oferta(
    val id: String = "",
    val empleadorUid: String = "",
    val descripcion: String = "",
    val modalidad: String = "",
    val ubicacion: String = "",
    val estado: String = "Activa"
)
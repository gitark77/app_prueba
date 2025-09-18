package com.example.myappcancheito.model

data class Postulacion(
    val id: String = "",
    val ofertaId: String = "",
    val postulanteUid: String = "",
    val fecha: Long = 0L,
    val estado: String = "Enviado"
)
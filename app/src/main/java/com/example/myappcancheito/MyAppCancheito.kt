package com.example.myappcancheito

import android.app.Application
import com.example.myappcancheito.repository.*
import com.example.myappcancheito.viewmodel.ViewModelFactory

class MyAppCancheito : Application() {

    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreate() {
        super.onCreate()

        val authRepository = AuthRepository()
        val userRepository = UserRepository()
        val postulanteRepository = PostulanteRepository()
        val empleadorRepository = EmpleadorRepository()
        val storageRepository = StorageRepository()
        val ofertaRepository = OfertaRepository()
        val postulacionRepository = PostulacionRepository()
        val categoriaRepository = CategoriaRepository()
        val calificacionRepository = CalificacionRepository()

        viewModelFactory = ViewModelFactory(
            authRepository,
            userRepository,
            postulanteRepository,
            empleadorRepository,
            storageRepository,
            ofertaRepository,
            postulacionRepository,
            categoriaRepository,
            calificacionRepository
        )
    }
}
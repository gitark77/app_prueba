package com.example.myappcancheito.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myappcancheito.repository.*

class ViewModelFactory(
    private val authRepository: AuthRepository,
    private val userRepository: UserRepository,
    private val postulanteRepository: PostulanteRepository,
    private val empleadorRepository: EmpleadorRepository,
    private val storageRepository: StorageRepository,
    private val ofertaRepository: OfertaRepository,
    private val postulacionRepository: PostulacionRepository,
    private val categoriaRepository: CategoriaRepository,
    private val calificacionRepository: CalificacionRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> AuthViewModel(authRepository) as T
            modelClass.isAssignableFrom(UserViewModel::class.java) -> UserViewModel(userRepository) as T
            modelClass.isAssignableFrom(PostulanteViewModel::class.java) -> PostulanteViewModel(postulanteRepository) as T
            modelClass.isAssignableFrom(EmpleadorViewModel::class.java) -> EmpleadorViewModel(empleadorRepository) as T
            modelClass.isAssignableFrom(StorageViewModel::class.java) -> StorageViewModel(storageRepository) as T
            modelClass.isAssignableFrom(OfertaViewModel::class.java) -> OfertaViewModel(ofertaRepository) as T
            modelClass.isAssignableFrom(PostulacionViewModel::class.java) -> PostulacionViewModel(postulacionRepository) as T
            modelClass.isAssignableFrom(CategoriaViewModel::class.java) -> CategoriaViewModel(categoriaRepository) as T
            modelClass.isAssignableFrom(CalificacionViewModel::class.java) -> CalificacionViewModel(calificacionRepository) as T
            else -> throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }
}
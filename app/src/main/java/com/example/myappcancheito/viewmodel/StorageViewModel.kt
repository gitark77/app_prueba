package com.example.myappcancheito.viewmodel

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.example.myappcancheito.repository.StorageRepository

class StorageViewModel(private val storageRepository: StorageRepository) : ViewModel() {

    fun uploadFile(path: String, uri: Uri) = storageRepository.uploadFile(path, uri)

    fun getFileUrl(path: String) = storageRepository.getFileUrl(path)
}
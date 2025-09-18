package com.example.myappcancheito.repository

import android.net.Uri
import com.google.firebase.storage.FirebaseStorage

class StorageRepository {

    private val storage = FirebaseStorage.getInstance().reference

    fun uploadFile(path: String, uri: Uri) = storage.child(path).putFile(uri)

    fun getFileUrl(path: String) = storage.child(path).downloadUrl
}
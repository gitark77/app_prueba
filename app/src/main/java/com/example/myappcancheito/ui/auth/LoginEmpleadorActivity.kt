package com.example.myappcancheito.ui.auth

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.myappcancheito.R
import android.content.Intent
import android.util.Patterns
import android.widget.Toast
import com.example.myappcancheito.databinding.ActivityLoginEmpleadorBinding
import com.google.firebase.auth.FirebaseAuth
import androidx.appcompat.app.AlertDialog
import com.example.myappcancheito.ui.main.EmpleadorActivity

class LoginEmpleadorActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginEmpleadorBinding
    private lateinit var firebaseAuth: FirebaseAuth

    private var email = ""
    private var password = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginEmpleadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnLoginEmp.setOnClickListener {
            validarInfo()
        }

        binding.tvIrRegistroEmp.setOnClickListener {
            startActivity(Intent(this, RegisterEmpleadorActivity::class.java))
        }
    }

    private fun validarInfo() {
        email = binding.etCorreoEmp.text.toString().trim()
        password = binding.etContrasenaEmp.text.toString().trim()

        when {
            email.isEmpty() -> {
                binding.etCorreoEmp.error = "Ingrese email"
                binding.etCorreoEmp.requestFocus()
            }
            !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> {
                binding.etCorreoEmp.error = "Email no válido"
                binding.etCorreoEmp.requestFocus()
            }
            password.isEmpty() -> {
                binding.etContrasenaEmp.error = "Ingrese contraseña"
                binding.etContrasenaEmp.requestFocus()
            }
            else -> {
                loginEmpleador()
            }
        }
    }

    private fun loginEmpleador() {
        val loadingDialog = AlertDialog.Builder(this)
            .setTitle("Espere por favor")
            .setMessage("Ingresando...")
            .setCancelable(false)
            .create()
        loadingDialog.show()
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnSuccessListener { authResult ->
                val uid = authResult.user?.uid ?: return@addOnSuccessListener
                val database = com.google.firebase.database.FirebaseDatabase.getInstance()

                database.getReference("Usuarios").child(uid).get()
                    .addOnSuccessListener { snapshot ->
                        loadingDialog.dismiss()
                        val tipoUsuario = snapshot.child("tipoUsuario").value?.toString()

                        if (tipoUsuario == "empleador") {
                            Toast.makeText(this, "Bienvenido(a)", Toast.LENGTH_SHORT).show()
                            startActivity(Intent(this, EmpleadorActivity::class.java))
                            finishAffinity()
                        } else {
                            firebaseAuth.signOut()
                            Toast.makeText(
                                this,
                                "Este usuario no es empleador, ingrese en la opción correcta",
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    }
                    .addOnFailureListener { e ->
                        loadingDialog.dismiss()
                        Toast.makeText(this, "Error al verificar usuario: ${e.message}", Toast.LENGTH_SHORT).show()
                    }
            }
            .addOnFailureListener { e ->
                loadingDialog.dismiss()
                Toast.makeText(this, "No se pudo iniciar sesión: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }
}
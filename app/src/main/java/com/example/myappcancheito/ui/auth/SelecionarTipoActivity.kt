package com.example.myappcancheito.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myappcancheito.databinding.ActivitySelecionarTipoBinding

class SelecionarTipoActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelecionarTipoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelecionarTipoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tipoempleador.setOnClickListener {
            startActivity(Intent(this, LoginEmpleadorActivity::class.java))
        }
        binding.tipopostulante.setOnClickListener {
            startActivity(Intent(this, LoginPostulanteActivity::class.java))
        }
    }
}
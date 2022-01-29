package com.cursoandroid.practico1.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cursoandroid.practico1.R
import com.cursoandroid.practico1.databinding.ActivityDetalleRecursoBinding
import com.cursoandroid.practico1.models.Recurso

class DetalleRecurso : AppCompatActivity() {
    private lateinit var recurso: Recurso
    private lateinit var binding: ActivityDetalleRecursoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalleRecursoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent.getSerializableExtra("recurso")?.let {
            recurso = it as Recurso
        }
        setupDataText()
        setupClickListener()
    }

    private fun setupClickListener() {
        val objRecurso = recurso ?: return
        var enlace = recurso.enlace

        binding.lbEnlace.setOnClickListener {
            val intent = Intent(this, MyWebViewActivity::class.java)
            intent.putExtra("enlace", enlace)
            startActivity(intent)

        }
    }

    private fun setupDataText() {
        val objRecurso = recurso ?: return
        binding.lbNombre.text = objRecurso.nombre
        binding.lbDescripcion.text = objRecurso.descripcion
        binding.lbFecha.text = objRecurso.fechaAgregado

    }


}
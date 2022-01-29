package com.cursoandroid.practico1.models

import java.io.Serializable
import java.util.*

data class Recurso(
    val nombre:String,
    val descripcion:String,
    val enlace:String,
    val fechaAgregado:String
):Serializable

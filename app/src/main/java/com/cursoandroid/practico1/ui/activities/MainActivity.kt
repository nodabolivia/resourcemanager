package com.cursoandroid.practico1.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cursoandroid.practico1.databinding.ActivityMainBinding
import com.cursoandroid.practico1.models.Recurso
import com.cursoandroid.practico1.ui.adapters.RecursoArrayAdapter
import com.cursoandroid.practico1.ui.adapters.RecursoClickListener

class MainActivity : AppCompatActivity(), RecursoClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListView()
    }

    private fun setupListView() {
        val recursos = mutableListOf(
            Recurso(
                "De otro Mundo",
                "Tú eres lo que estaba buscando.La tímida doctora Phoebe Jones se ruborizó al oír decir esas palabras al detective Kevin Cartwright, un hombre muy sexy. Pero cuando el guapísimo ex policía le explicó que ella era una de los cuatro hermanos que debía localizar, estuvo a punto de derrumbarse en sus fuertes brazos.",
                "https://www.leernovelasonline.com/2021/09/carla-cassidy-de-otro-mundo.html",
                "10/08/2021"
            ),
            Recurso(
                "Pies De Barro",
                "Alguien está asesinando a ancianitos inofensivos en Ankh-Morpork y la Guarda de la Urbe desea saber quién es. También desea saber otras muchas cosas, como quién está envenenando de forma lenta al patricio y dejando la urbe sin gobierno. Y cómo lo hace. Y por qué los gólems se comportan de forma tan extraña últimammente. Y por qué todas y cada una de las malditas pistas apuntan en la dirección equivocada. Y lo más inquietante de todo: cómo posiblemente Nobby Nobbs (que precisa papeles firmados para probar que es un humano) esté recibiendo convidaciones para las fiestas más distinguidas d de la urbe. Un reto para el comandante Sam Vimes y su tropa multiétnica de la Guarda de Ankh-Morpork, en una historia de intriga con la que Pratchett prueba una vez más que las investigaciones policiales en el Planeta disco siempre y en todo momento deparan más de una sorpresa.",
                "https://www.libros-online.net/libros/pies-de-barro/",
                "16/09/2021"
            ),
            Recurso(
                "Landeron I: La Hija Del Oráculo De Paula",
                "Un libro de no en la categoría de Nuevas Subidas ",
                "https://www.libros-online.net/libros/landeron-i-la-hija-del-oraculo-de-paula/",
                "24/08/2021"
            ),
            Recurso(
                "Adivina Quién Soy Esta Noche",
                "Yanira y Dylan se trasladan a Los Ángeles para organizartodos los preparativos de su boda. Allí las cosas se complicancuando una ex amante de él pierde los papeles y eso casile cuesta la vida a la joven. Una vez recuperada, se casan ycomienzan una vida pletórica y feliz. Ambos son dos fierasdel sexo. Les gusta el morbo, la fantasía y experimentar cosasnuevas. Juntos inventan un juego llamado «Adivina quiénsoy esta noche», plagado de lujuria, posesión y sensacionesdonde los límites los ponen ellos mismos.Todo marcha a las mil maravillas, hasta que Yanira regresa alos escenarios. Lo que para ella es un sueño hecho realidad,para Dylan será el punto de partida de muchos problemas,desconfianzas, celos y rupturas que se multiplicarán con elmalmeter de la prensa. Yanira y Dylan no podrán evitar quesus vidas se descontrolen de una manera que ninguno deellos pudo nunca imaginar.Adivina quién soy esta noche es una novela llena de humor,donde la sexualidad y sensualidad de los protagonistas haránque tu cuerpo entre en combustión. Con seguridad, cuandocierres el libro, buscarás a tu pareja y le susurrarás al oído,dispuesta a jugar: «Adivina quién soy esta noche».",
                "https://www.libros-online.net/libros/adivina-quien-soy-esta-noche/",
                "25/08/2021"
            ),
            Recurso(
                "Curso de Inglês Online",
                "Primeiramente o nosso Curso de Inglês online Grátis é Básico  e conta com *Certificado opcional válido em todo Brasil.",
                "https://certificadocursosonline.com/cursos/curso-de-ingles-basico-online-gratis/",
                "26/08/2021"
            ),
            Recurso(
                "MEGA CURSO DE ADMINISTRACION DE BANCA Y SEGURO",
                "6 meses",
                "https://cursosonline.us/course/mega-de-administracion-de-banca-y-seguro/",
                "27/08/2021"
            )
        )
        val adapter = RecursoArrayAdapter(this, recursos, this)
        binding.lstRecursos.adapter = adapter
    }

    override fun recursoClicked(recurso: Recurso) {
        val intent = Intent(this, DetalleRecurso::class.java)
        intent.putExtra("recurso", recurso)
        startActivity(intent)
    }
}
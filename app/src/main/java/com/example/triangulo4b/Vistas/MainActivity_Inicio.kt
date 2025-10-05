package com.example.triangulo4b.Vistas

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.R

class MainActivity_Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_inicio)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    //para cambiar de pantallas dando click en los botones
    fun clickCirculo(view: View){
          val circulo= Intent(this, MainActivity_Circulo::class.java)
        startActivity(circulo)
    }
    fun clickCuadrado(view: View){
        val cuadrado= Intent(this, MainActivity_Cuadrado::class.java)
        startActivity(cuadrado)
    }
    fun clickRectangulo(view: View){
        val rectangulo= Intent(this, MainActivity_Rectangulo::class.java)
        startActivity(rectangulo)
    }
    fun clickTriangulo(view: View){
        val triangulo= Intent(this, MainActivity_Triangulo::class.java)
        startActivity(triangulo)
    }
}
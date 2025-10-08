package com.example.triangulo4b.Vistas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
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

        val spinner = findViewById<Spinner>(R.id.spnOpcion)
        val boton = findViewById<Button>(R.id.btnIr)
        val opciones = arrayOf("Triangulo", "Rectangulo", "Circulo", "Cuadrado")

        val adaptador= ArrayAdapter<String>(this,
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            opciones)
        spinner.adapter = adaptador

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        boton.setOnClickListener {
            when (spinner.selectedItem.toString()) {
                "Triangulo" -> {
                    val intent = Intent(this, MainActivity_Triangulo::class.java)
                    startActivity(intent)
                }

                "Rectangulo" -> {
                    val intent = Intent(this, MainActivity_Rectangulo::class.java)
                    startActivity(intent)
                }

                "Circulo" -> {
                    val intent = Intent(this, MainActivity_Circulo::class.java)
                    startActivity(intent)
                }

                "Cuadrado" -> {
                    val intent = Intent(this, MainActivity_Cuadrado::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
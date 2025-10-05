package com.example.triangulo4b.Vistas

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.triangulo4b.Contratos.ContratoCirculo
import com.example.triangulo4b.Contratos.ContratoCuadrado
import com.example.triangulo4b.Presentadores.CirculoPresentador
import com.example.triangulo4b.Presentadores.CuadradoPresentador
import com.example.triangulo4b.R

class MainActivity_Cuadrado : AppCompatActivity(), ContratoCuadrado.Vista {
    private lateinit var txvRes: TextView
    private lateinit var presentador: ContratoCuadrado.Presentador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_cuadrado)

        //inicializar componentes
        val txtl1=findViewById<EditText>(R.id.edtl1)
        val btnArea=findViewById<Button>(R.id.btnArea)
        val btnPerimetro=findViewById<Button>(R.id.btnPerimetro)
        txvRes=findViewById<TextView>(R.id.txvRes)

        //inicializamos al presentador
        presentador= CuadradoPresentador(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnPerimetro.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            presentador.calcularPerimetro(l1)
        }

        btnArea.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            presentador.calcularArea(l1)
        }
    }
    //regresar a la pantalla principal
    fun clickregresar(view: View)
    {
        val salir= Intent(this, MainActivity_Inicio::class.java)
        startActivity(salir)

    }
    override fun ShowArea(area: Float) {
        txvRes.text="El area es : ${area}"
    }

    override fun ShowPeri(perimetro: Float) {
        txvRes.text="El perimetro es : ${perimetro}"
    }

    override fun ShowError(msg: String) {
        txvRes.text=msg
    }
}
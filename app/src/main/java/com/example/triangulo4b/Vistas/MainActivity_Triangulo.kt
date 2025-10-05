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
import com.example.triangulo4b.Contratos.ContratoTriangulo
import com.example.triangulo4b.Presentadores.TrianguloPresentador
import com.example.triangulo4b.R

class MainActivity_Triangulo : AppCompatActivity(), ContratoTriangulo.Vista {

    //declaramos a txtrespara poder usarlo
    private lateinit var txvRes: TextView
    //declaramos el presentador que vamos a ocupar en la vista
    private lateinit var presentador: ContratoTriangulo.Presentador



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_triangulo)

        //inicializamos los componentes que vamos a utilizar
        val txtl1=findViewById<EditText>(R.id.edtl1)
        val txtl2=findViewById<EditText>(R.id.edtl2)
        val txtl3=findViewById<EditText>(R.id.edtl3)
        val btnArea=findViewById<Button>(R.id.btnArea)
        val btnPerimetro=findViewById<Button>(R.id.btnPerimetro)
        val btnTipo=findViewById<Button>(R.id.btnTipo)
        txvRes=findViewById<TextView>(R.id.txvRes)

        //inicializamos al presentador
        presentador= TrianguloPresentador(this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPerimetro.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            val l2=txtl2.text.toString().toFloat()
            val l3=txtl3.text.toString().toFloat()
            presentador.perimetro(l1,l2,l3)
        }

        btnArea.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            val l2=txtl2.text.toString().toFloat()
            val l3=txtl3.text.toString().toFloat()
            presentador.area(l1,l2,l3)
        }

        btnTipo.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            val l2=txtl2.text.toString().toFloat()
            val l3=txtl3.text.toString().toFloat()
            presentador.tipo(l1,l2,l3)
        }

    }
    //regresar a la pantalla principal
    fun clickregresar(view: View)
    {
        val salir= Intent(this, MainActivity_Inicio::class.java)
        startActivity(salir)

    }

    override fun showArea(area: Float) {
        txvRes.text="El area es : ${area}"
    }

    override fun showPerimetro(perimetro: Float) {
        txvRes.text="El perimetro es : ${perimetro}"
    }

    override fun showTipo(tipo: String) {
        txvRes.text="El triangulo es ${tipo}"
    }

    override fun showError(msg: String) {
        txvRes.text=msg
    }

}
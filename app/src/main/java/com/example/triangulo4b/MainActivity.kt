package com.example.triangulo4b

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //inicializamos los componentes que vamos a utilizar
        val txtl1=findViewById<EditText>(R.id.edtl1)
        val txtl2=findViewById<EditText>(R.id.edtl2)
        val txtl3=findViewById<EditText>(R.id.edtl3)
        val btnArea=findViewById<Button>(R.id.btnArea)
        val btnPerimetro=findViewById<Button>(R.id.btnPerimetro)
        val btnTipo=findViewById<Button>(R.id.btnTipo)
        val txvRes=findViewById<TextView>(R.id.txvRes)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnPerimetro.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            val l2=txtl2.text.toString().toFloat()
            val l3=txtl3.text.toString().toFloat()
            val p=l1+l2+l3
            txvRes.text="El perimetro es : ${p}"
        }

        btnArea.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            val l2=txtl2.text.toString().toFloat()
            val l3=txtl3.text.toString().toFloat()
            val s=(l1+l2+l3)/2
            val a= sqrt(s*(s-l1)*(s-l2)*(s-l3))
            txvRes.text="El are a es : ${a}"
        }

        btnTipo.setOnClickListener {
            val l1= txtl1.text.toString().toFloat()
            val l2=txtl2.text.toString().toFloat()
            val l3=txtl3.text.toString().toFloat()
            var tipo=""
            if(l1==l2 && l2==l3)
                tipo="El triangulo es Equilatero"
            else if(l1!=l2 && l2!=l3 && l3!=l1)
                tipo= "El triangulo es escaleno"
            else
                tipo="El triangulo es isoceles"

            txvRes.text=tipo
        }

    }

}
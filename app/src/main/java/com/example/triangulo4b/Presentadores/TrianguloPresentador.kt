package com.example.triangulo4b.Presentadores

import com.example.triangulo4b.Contratos.ContratoTriangulo
import com.example.triangulo4b.Modelos.TrianguloModelo

class TrianguloPresentador(private val vista: ContratoTriangulo.Vista): ContratoTriangulo.Presentador {

    private val modelo: ContratoTriangulo.Modelo= TrianguloModelo()

    override fun area(l1: Float, l2: Float, l3: Float) {
        if(modelo.valida(l1,l2,l3)==true){
            val a=modelo.area(l1,l2,l3)
            vista.showArea(a)
        }else
            vista.showError("Datos no validos")
    }

    override fun perimetro(l1: Float, l2: Float, l3: Float) {
        if(modelo.valida(l1,l2,l3)){
            val p=modelo.perimetro(l1,l2,l3)
            vista.showPerimetro(p)
        }else{
            vista.showError("Datos no validos")
        }
    }

    override fun tipo(l1: Float, l2: Float, l3: Float) {
        if(modelo.valida(l1,l2,l3)==true){
            val t=modelo.tipo(l1,l2,l3)
            vista.showTipo(t)
        }else{
            vista.showError("Datos no validos")
        }
    }
}
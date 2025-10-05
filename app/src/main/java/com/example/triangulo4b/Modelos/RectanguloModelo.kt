package com.example.triangulo4b.Modelos

import com.example.triangulo4b.Contratos.ContratoRectangulo

class RectanguloModelo: ContratoRectangulo.Modelo {
    override fun calcularArea(lado1: Float, lado2: Float): Float {
        val area:Float= lado1*lado2
        return area
    }

    override fun calcularPerimetro(lado1: Float, lado2: Float): Float {
        val peri:Float= 2*(lado1+lado2)
        return peri
    }

    override fun validarRectangulo(lado1: Float, lado2: Float): Boolean {
        if(lado1==lado2)
            return false
        else
            return true

    }
}
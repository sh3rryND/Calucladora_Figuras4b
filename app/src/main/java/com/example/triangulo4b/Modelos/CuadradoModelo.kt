package com.example.triangulo4b.Modelos

import com.example.triangulo4b.Contratos.ContratoCuadrado

class CuadradoModelo: ContratoCuadrado.Modelo {
    override fun calcularArea(lado1: Float): Float {
        return lado1 * lado1;
    }

    override fun calcularPerimetro(lado1: Float): Float {
        return lado1*4
    }

    override fun validarCuadrado(lado1: Float): Boolean {
        if(lado1>0)
            return true
        else
            return false
    }
}
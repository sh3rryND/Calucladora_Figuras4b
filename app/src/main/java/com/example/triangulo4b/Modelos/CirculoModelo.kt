package com.example.triangulo4b.Modelos

import com.example.triangulo4b.Contratos.ContratoCirculo
import kotlin.math.pow

class CirculoModelo : ContratoCirculo.Modelo{
    override fun calcularArea(radio: Float): Float {
        val resultado: Float = (Math.PI *radio* radio).toFloat()
        return resultado

    }

    override fun calcularPerimetro(radio: Float): Float {
        val resultado: Float = (2* Math.PI *radio).toFloat()
        return resultado
    }

    override fun validarCirculo(radio: Float): Boolean {
        if(radio>0)
            return true
        else
            return false
    }
}
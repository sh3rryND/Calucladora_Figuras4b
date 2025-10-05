package com.example.triangulo4b.Presentadores

import com.example.triangulo4b.Contratos.ContratoCuadrado
import com.example.triangulo4b.Contratos.ContratoRectangulo
import com.example.triangulo4b.Modelos.CuadradoModelo
import com.example.triangulo4b.Modelos.RectanguloModelo

class CuadradoPresentador(private val vista: ContratoCuadrado.Vista): ContratoCuadrado.Presentador  {


    private val modelo: ContratoCuadrado.Modelo = CuadradoModelo()
    override fun calcularArea(lado1: Float) {
        if (modelo.validarCuadrado(lado1)) {
            val area = modelo.calcularArea(lado1)
            vista.ShowArea(area)
        } else {
            vista.ShowError("Dato no válido")
        }
    }

    override fun calcularPerimetro(lado1: Float) {
        if (modelo.validarCuadrado(lado1)) {
            val perimetro = modelo.calcularPerimetro(lado1)
            vista.ShowPeri(perimetro)
        } else {
            vista.ShowError("Dato no válido")
        }
    }
}

package com.example.triangulo4b.Presentadores

import com.example.triangulo4b.Contratos.ContratoCirculo
import com.example.triangulo4b.Contratos.ContratoRectangulo
import com.example.triangulo4b.Modelos.CirculoModelo
import com.example.triangulo4b.Modelos.RectanguloModelo

class CirculoPresentador(private val vista: ContratoCirculo.Vista): ContratoCirculo.Presentador {

    private val modelo: ContratoCirculo.Modelo = CirculoModelo()

    override fun calcularArea(radio: Float) {
        if (modelo.validarCirculo(radio)) {
            val area = modelo.calcularArea(radio)
            vista.ShowArea(area)
        } else {
            vista.ShowError("Dato no válido")
        }
    }

    override fun calcularPerimetro(radio: Float) {
        if (modelo.validarCirculo(radio)) {
            val perimetro = modelo.calcularPerimetro(radio)
            vista.ShowPeri(perimetro)
        } else {
            vista.ShowError("Dato no válido")
        }
    }
}
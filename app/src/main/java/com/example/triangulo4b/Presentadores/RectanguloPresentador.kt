package com.example.triangulo4b.Presentadores

import com.example.triangulo4b.Contratos.ContratoCuadrado
import com.example.triangulo4b.Contratos.ContratoRectangulo
import com.example.triangulo4b.Contratos.ContratoTriangulo
import com.example.triangulo4b.Modelos.RectanguloModelo
import com.example.triangulo4b.Modelos.TrianguloModelo

class RectanguloPresentador(private val vista: ContratoRectangulo.Vista): ContratoRectangulo.Presentador {

    private val modelo: ContratoRectangulo.Modelo = RectanguloModelo()

    override fun calcularArea(lado1: Float, lado2: Float) {
        if (modelo.validarRectangulo(lado1, lado2)) {
            val area = modelo.calcularArea(lado1, lado2)
            vista.ShowArea(area)
        } else {
            vista.ShowError("Datos no validos")
        }
    }

    override fun calcularPerimetro(lado1: Float, lado2: Float) {
        if (modelo.validarRectangulo(lado1, lado2)) {
            val peri = modelo.calcularPerimetro(lado1, lado2)
            vista.ShowPeri(perimetro = peri)
        } else {
            vista.ShowError("Datos no validos")

        }

    }
}
package com.example.triangulo4b.Contratos

interface ContratoRectangulo {

    interface Vista
    {
        fun ShowArea(area:Float)

        fun ShowPeri(perimetro:Float)
        fun ShowError(msg: String)
    }
    interface Modelo
    {
        fun calcularArea(lado1:Float,lado2:Float):Float
        fun calcularPerimetro(lado1:Float,lado2:Float):Float
        fun validarRectangulo(lado1:Float,lado2:Float):Boolean

    }

    interface Presentador
    {
        fun calcularArea(lado1:Float,lado2:Float)
        fun calcularPerimetro(lado1:Float,lado2:Float)

    }
}
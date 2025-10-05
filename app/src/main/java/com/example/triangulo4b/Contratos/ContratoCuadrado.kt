package com.example.triangulo4b.Contratos

interface ContratoCuadrado {
    interface Vista
    {
        fun ShowArea(area:Float)
        fun ShowPeri(perimetro:Float)
        fun ShowError(msg: String)
    }
    interface Modelo
    {
        fun calcularArea(lado1:Float):Float
        fun calcularPerimetro(lado1:Float):Float
        fun validarCuadrado(lado1:Float):Boolean

    }

    interface Presentador
    {
        fun calcularArea(lado1:Float)
        fun calcularPerimetro(lado1:Float)

    }
}
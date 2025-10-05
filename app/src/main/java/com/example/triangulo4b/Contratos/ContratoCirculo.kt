package com.example.triangulo4b.Contratos

interface ContratoCirculo {
    interface Vista
    {
        fun ShowArea(area:Float)
        fun ShowPeri(perimetro:Float)
        fun ShowError(msg: String)
    }
    interface Modelo
    {
        fun calcularArea(radio:Float):Float
        fun calcularPerimetro(radio:Float):Float
        fun validarCirculo(radio:Float):Boolean

    }

    interface Presentador
    {
        fun calcularArea(radio:Float)
        fun calcularPerimetro(radio:Float)

    }
}
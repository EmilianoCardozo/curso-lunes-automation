package com.cardozo.Trabajo_Practico_1.Ejercicio_1;

public class Calculadora {

    private Integer Valor1;
    private Integer Valor2;

    public Calculadora(Integer Valor1, Integer Valor2){
        this.Valor1 = Valor1;
        this.Valor2 = Valor2;
    }

    public Integer sumar(){
        int suma = Valor1 + Valor2;
        return suma;
    }

    public Integer restar(){
        int resta = Valor1 - Valor2;
        return resta;
    }

    public Integer multiplicar(){
        int multiplicacion = Valor1 * Valor2;
        return multiplicacion;
    }

    public Double dividir(){
        double division = (double) Valor1 / (double) Valor2;
        return division;
    }
}

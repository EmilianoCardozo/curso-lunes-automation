package com.cardozo.material_curso_automation.Trabajo_Practico_1.Ejercicio_1;

/*
Ejercicio 1
Realizar un programa que simule una calculadora.
La estructura del programa debe contener dos clases:
● una clase que tenga el método especial main para poder ejecutar lo que se pide en
los requerimientos,
● y otra clase llamada Calculadora
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        do {

            System.out.println("ingrese el primer número entero: ");
            Integer PrimerValor = scanner.nextInt();

            System.out.println("ingrese el segundo número entero: ");
            Integer SegundoValor = scanner.nextInt();

            System.out.println("ingrese el número que representa la operación mateática que desea realizar: ");
            System.out.println("1 (+), 2 (-), 3 (*), 4 (/): ");
            Integer OperadorMetematico = scanner.nextInt();

            Calculadora MiCalculadora = new Calculadora(PrimerValor, SegundoValor);

            if (OperadorMetematico == 1) {

                if (MiCalculadora.sumar() < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo");
                }
                else if (MiCalculadora.sumar() > 1000) {
                    System.out.println("Error, resultado muy grande");
                }
                else {
                    System.out.println("El resultado es: " + MiCalculadora.sumar());
                }

            } else if (OperadorMetematico == 2) {

                if (MiCalculadora.restar() < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo");
                }
                else if (MiCalculadora.restar() > 1000) {
                    System.out.println("Error, resultado muy grande");
                }
                else {
                    System.out.println("El resultado es: " + MiCalculadora.restar());
                }

            } else if (OperadorMetematico == 3) {

                if (MiCalculadora.multiplicar() < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo");
                }
                else if (MiCalculadora.multiplicar() > 1000) {
                    System.out.println("Error, resultado muy grande");
                }
                else {
                    System.out.println("El resultado es: " + MiCalculadora.multiplicar());
                }

            } else if (OperadorMetematico == 4) {

                if (MiCalculadora.dividir() < 0) {
                    System.out.println("Tené cuidado, el resultado es negativo");
                }
                else if (MiCalculadora.dividir() > 1000) {
                    System.out.println("Error, resultado muy grande");
                }
                else {
                    System.out.println("El resultado es: " + MiCalculadora.dividir());
                }
            } else {
                System.out.println("Operación no válida");
            }

            contador++;

        } while (contador < 5);


    }
}

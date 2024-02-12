package com.cardozo.Clase_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2colecciones {

    public static void main(String[] args) {

        //Arrays

        int[] ArrayDeEnteros = new int[3];

        ArrayDeEnteros[0] = 100;
        ArrayDeEnteros[1] = 200;
        ArrayDeEnteros[2] = 300;

        System.out.println("El valor de la posició 0 es " + ArrayDeEnteros[0]);
        System.out.println("El valor de la posició 1 es " + ArrayDeEnteros[1]);
        System.out.println("El valor de la posició 2 es " + ArrayDeEnteros[2]);

        System.out.println("El array es " + Arrays.toString(ArrayDeEnteros));

        ArrayDeEnteros[2] = 400;

        //En un array no se pueden insertar o imprimir posiciones que no han sido definidas junto con el array


        //Listas

        List<String> ListaDeString = new ArrayList<>();

        ListaDeString.add("Hola");
        ListaDeString.add("Como");
        ListaDeString.add("Estan?");

        System.out.println("La lista contiene " + ListaDeString);

        System.out.println("La pos. 0 contiene " + ListaDeString.get(0));
        System.out.println("La pos. 2 contiene " + ListaDeString.get(2));



    }
}

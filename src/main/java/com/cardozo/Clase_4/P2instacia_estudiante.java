package com.cardozo.Clase_4;

public class P2instacia_estudiante {

    public static void main(String[] args) {

        P1estudiante Pepe = new P1estudiante(5, "Pepe Box", 10.0f);

        System.out.println("Id: " + Pepe.getId());
        System.out.println("Nombre complete: " + Pepe.getNombreCompleto());
        System.out.println("Promedio: " + Pepe.getPromedio());

        System.out.println();

        //Le cambiamos el promedio
        Pepe.setPromedio(8.0f);
        System.out.println("Promedio actual: " + Pepe.getPromedio());

        System.out.println();

        P1estudiante nn = new P1estudiante();

        System.out.println("Id: " + nn.getId());
        System.out.println("Nombre complete: " + nn.getNombreCompleto());
        System.out.println("Promedio: " + nn.getPromedio());

    }
}

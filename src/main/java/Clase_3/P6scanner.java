package Clase_3;

import java.util.Scanner;

public class P6scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("ingrese un double: ");
        Double precio = scanner.nextDouble();

        System.out.println("ingrese una entero: ");
        Integer DiaDeSemana = scanner.nextInt();

        System.out.println("cadena ingresada " + cadena);
        System.out.println("precio " + precio);
        System.out.println("dia de semana " + DiaDeSemana);

    }
}

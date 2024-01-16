package Clase_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7ejercicio_combinado {

    public static void main(String[] args) {

        List<Double> ListaDeDatos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número menor a 500: ");
        Double número = sc.nextDouble();

        while (número <=500){
            ListaDeDatos.add(número);
            System.out.println("Ingrese un número menor a 500: ");
            número = sc.nextDouble();
        }

        System.out.println("El número ingresado es mayor a 500");

        System.out.println("La lista contiene los siguientes datos " + ListaDeDatos);

        System.out.println("La lista contiene un total de " + ListaDeDatos.size() + " datos");

        if (ListaDeDatos.size() < 10) {
            System.out.println("Se ingresaron pocos números");
        }
        else {
            System.out.println("Se excedió la cantidad de ingresos");
        }


    }


}

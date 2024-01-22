package Clase_5.PracticaHerencia.Instancias;

import Clase_5.PracticaHerencia.Clases.Coche;
import Clase_5.PracticaHerencia.Clases.Vehiculo;

public class Main {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);

        Coche coche = new Coche("Ford", "Mustang", 2021, 5000);

        System.out.println(vehiculo.getMarca());
        System.out.println(vehiculo.getModelo());
        System.out.println(vehiculo.getAño());

        vehiculo.acelerar();

        System.out.println();

        System.out.println(coche.getMarca());
        System.out.println(coche.getModelo());
        System.out.println(coche.getAño());
        System.out.println(coche.getCilindrada());
        
        coche.acelerar();

    }

}

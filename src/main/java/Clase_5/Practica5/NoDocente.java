package Clase_5.Practica5;

import Clase_5.Practica4.Persona;

public class NoDocente extends Persona {

    public NoDocente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void saludar() {
        System.out.println("Buen día");
    }
}

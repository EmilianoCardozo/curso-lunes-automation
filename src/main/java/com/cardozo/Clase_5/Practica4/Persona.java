package com.cardozo.Clase_5.Practica4;

public class Persona {

    protected String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected void saltar() {
        System.out.println("Estoy saltando");
    }

    public void saludar() {
        System.out.println("Hola, como estan?");
    }

}
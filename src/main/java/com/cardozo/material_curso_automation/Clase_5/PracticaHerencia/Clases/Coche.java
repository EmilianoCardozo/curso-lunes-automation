package com.cardozo.material_curso_automation.Clase_5.PracticaHerencia.Clases;

public class Coche extends Vehiculo {

    private Integer cilindrada;

    public Coche(String marca, String modelo, Integer año, Integer cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void acelerar() {
        System.out.println("el coche está acelerando");
        }
}

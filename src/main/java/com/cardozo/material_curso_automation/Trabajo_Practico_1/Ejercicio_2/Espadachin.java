package com.cardozo.material_curso_automation.Trabajo_Practico_1.Ejercicio_2;

public class Espadachin extends Personaje {

    private Integer ataque;

    public Espadachin(Integer salud, Integer ataque) {
        super(salud);
        this. ataque = ataque;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    @Override
    public void entrenar() {
        ataque = ataque +10;
    }
}

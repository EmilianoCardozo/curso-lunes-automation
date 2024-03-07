package com.cardozo.material_curso_automation.Trabajo_Practico_1.Ejercicio_2;

public class Torre extends Personaje {

    private Integer nivel;

    public Torre(Integer salud, Integer nivel) {
        super(salud);
        this. nivel = nivel;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this. nivel = nivel;
    }

    @Override
    public void entrenar() {

        nivel = nivel + 1;
    }

}

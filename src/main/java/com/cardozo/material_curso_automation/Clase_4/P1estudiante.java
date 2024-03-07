package com.cardozo.material_curso_automation.Clase_4;

public class P1estudiante {

    private Integer id;
    private String nombreCompleto;
    private Float promedio;

    public P1estudiante() {
    }
    
    public P1estudiante(Integer id, String nombreCompleto, Float promedio) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.promedio = promedio;
    }

    public Integer getId() {

        return this.id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getNombreCompleto() {

        return this.nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {

        this.nombreCompleto = nombreCompleto;
    }

    public Float getPromedio() {

        return this.promedio;
    }

    public void setPromedio(Float promedio) {

        this.promedio = promedio;
    }

}

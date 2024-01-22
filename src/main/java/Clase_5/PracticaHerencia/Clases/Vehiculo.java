package Clase_5.PracticaHerencia.Clases;

public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer año;

    public Vehiculo(String marca, String modelo, Integer año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAño() {
        return año;
    }

    public void setAño(Integer año) {
        this.año = año;
    }

    public void acelerar() {
        System.out.println("el vehiculo está acelerando");
    }

    public void frenar() {
        System.out.println("el vehiculo está frenando");
    }
}

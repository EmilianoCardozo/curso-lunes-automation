package com.cardozo.material_curso_automation.Clase_7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoldadoTest {

    @Test
    public void testSoldadoDespuesDePelear() {

        Soldado soldado = new Soldado(50);

        soldado.pelear(10);

        Assert.assertEquals(soldado.getSalud(),45,"No corresponde este valor despues de pelear");
    }

    @Test
    public void testSoldadoMuerto() {

        Soldado soldado = new Soldado(50);

        soldado.pelear(120);

        Assert.assertTrue(soldado.estaMuerto(),"El soldado no esta muerto");
    }

    @Test
    public void testSoldadoDescansa() {

        Soldado soldado = new Soldado(15);

        soldado.descansar();

        Assert.assertEquals(soldado.getSalud(), 25);

    }
}

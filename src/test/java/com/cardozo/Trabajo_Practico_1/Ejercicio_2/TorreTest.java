package com.cardozo.Trabajo_Practico_1.Ejercicio_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TorreTest {

    @Test
    public void testTorreEntrenada() {

        Torre torre = new Torre(15,15);

        torre.entrenar();

        Assert.assertEquals(torre.getNivel(), 16, "El nivel no es correcto");

    }
}

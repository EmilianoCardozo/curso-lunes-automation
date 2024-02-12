package com.cardozo.Trabajo_Practico_1.Ejercicio_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EspadachinTest {

    @Test
    public void testEspadachinEntrenado() {

        Espadachin espadachin = new Espadachin(20, 10);

        espadachin.entrenar();

        Assert.assertEquals(espadachin.getAtaque(), 20, "el valor no es correcto");
    }
}

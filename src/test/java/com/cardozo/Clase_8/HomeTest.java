package com.cardozo.Clase_8;

import com.cardozo.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {

    @Test
    public void validarHome() {
        HomePage homePage = new HomePage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Pas 2: aserciones
        Assert.assertTrue(homePage.inputIsDisplayed(), "No se visualizo el input");
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.menuIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());
    }

}

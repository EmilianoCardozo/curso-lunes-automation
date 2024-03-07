package com.cardozo.opencart.stepDefinitions;

import com.cardozo.opencart.hooks.Hooks;
import com.cardozo.opencart.pages.HomePage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class HomeDefinitions {

    private HomePage homePage;

    public HomeDefinitions (){
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la pagina de inicio")
    public void queElUsuarioIngresaALaPaginaDeInicio() {

        Hooks.getDriver().get(Hooks.getProperty("url"));
    }

    @Entonces("el usuario valida la pagina de inicio")
    public void elUsuarioValidaLaPaginaDeInicio() {

        Assert.assertTrue(homePage.inputIsDisplayed(), "No se visualizo el input");
        Assert.assertTrue(homePage.carrouselIsDisplayed());
        Assert.assertTrue(homePage.menuIsDisplayed());
        Assert.assertTrue(homePage.myAccountIsDisplayed());
    }

}

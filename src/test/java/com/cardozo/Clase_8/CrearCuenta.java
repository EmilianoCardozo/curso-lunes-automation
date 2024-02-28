package com.cardozo.Clase_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrearCuenta extends BaseTest {

    @Test
    public void crearCuentaTest() {

        HomePage homePage = new HomePage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //Paso 1: levantar la página
        getDriver().get("https://opencart.abstracta.us/");

        //Paso 2: click en My Account
        homePage.clickMyAccount();

        //Paso 3: click en Register
        homePage.clickRegisterDropdown();

        //Paso 4: completar formulario y continuar
        myAccountPage.setNombre("Emiliano Jesús");
        myAccountPage.setApellido("Cardozo");
        myAccountPage.setEmail("emic_15@hotmail.com");
        myAccountPage.setTelefono("(351) 685-3850");
        myAccountPage.setPassword("1234");
        myAccountPage.setPasswordConfirm("1234");
        myAccountPage.clickAgree();
        myAccountPage.clickContinue();

        //Paso 5: validación
        Assert.assertTrue(myAccountPage.warningIsDisplayed());
    }
}

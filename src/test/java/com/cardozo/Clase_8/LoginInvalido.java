package com.cardozo.Clase_8;

import com.cardozo.Pages.HomePage;
import com.cardozo.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInvalido extends BaseTest {

    @Test
    public void loginInvalidoTest() {

        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());

        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: click en My Account
        homePage.clickMyAccount();

        // Paso 3: click en Login del dropdown
        homePage.clickLoginDropdown();

        // Paso 4: hacer login (ingresar user, pass y click en boton login)
        loginPage.setEmail("emic_08@hotmail.com");
        loginPage.setPassword("1234");
        loginPage.clickLogin();

        // Paso 5: validaciones
        Assert.assertTrue(loginPage.warningIsDisplayed());
    }
}

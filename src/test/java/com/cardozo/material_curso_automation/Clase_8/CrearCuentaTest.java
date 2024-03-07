package com.cardozo.material_curso_automation.Clase_8;

import com.cardozo.opencart.pages.AccountPage;
import com.cardozo.opencart.pages.HomePage;
import com.cardozo.opencart.pages.RegisterPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrearCuentaTest extends BaseTest {

    @Test
    public void crearCuentaTest() {

        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountPage accountPage = new AccountPage(getDriver());
        Faker faker = new Faker();

        //Paso 1: levantar la página
        getDriver().get("https://opencart.abstracta.us/");

        //Paso 2: click en My Account
        homePage.clickMyAccount();

        //Paso 3: click en Register
        homePage.clickRegisterDropdown();

        //Paso 4: completar formulario y continuar
        /*
        myAccountPage.setNombre("Emiliano Jesús");
        myAccountPage.setApellido("Cardozo");
        myAccountPage.setEmail("emic_15@hotmail.com");
        myAccountPage.setTelefono("(351) 685-3850");
        myAccountPage.setPassword("1234");
        myAccountPage.setPasswordConfirm("1234");
        */
        registerPage.completarForm(
                "Emiliano Cardozo",
                "Cardozo",
                faker.internet().emailAddress(),
                "(351) 685-3850",
                "1234",
                "1234"
                );
        registerPage.clickAgree();
        registerPage.clickContinue();

        //Paso 5: validación
        Assert.assertTrue(accountPage.confirmIsDisplayed());
    }
}

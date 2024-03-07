package com.cardozo.opencart.stepDefinitions;

import com.cardozo.opencart.hooks.Hooks;
import com.cardozo.opencart.pages.HomePage;
import com.cardozo.opencart.pages.RegisterPage;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class RegisterDefinitions {

    private HomePage homePage;
    private RegisterPage registerPage;
    private Faker faker;
    public RegisterDefinitions () {

        this.homePage = new HomePage(Hooks.getDriver());
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.faker = new Faker();
    }

    @Dado("que el usuario ingresa a la pagina de registro")
    public void queElUsuarioIngresaALaPaginaDeRegistro() {

        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickRegisterDropdown();
    }

    @Cuando("el usuario se registra con credenciales válidas")
    public void elUsuarioSeRegistraConCredencialesVálidas() {

        registerPage.completarForm(
                Hooks.getProperty("nombre"),
                Hooks.getProperty("apellido"),
                faker.internet().emailAddress(),
                Hooks.getProperty("telefono"),
                Hooks.getProperty("password"),
                Hooks.getProperty("password")
        );
        registerPage.clickAgree();
        registerPage.clickContinue();
    }

    @Cuando("el usuario se registra con credenciales inválidas")
    public void elUsuarioSeRegistraConCredencialesInválidas() {

        registerPage.completarForm(
                Hooks.getProperty("nombre"),
                Hooks.getProperty("apellido"),
                Hooks.getProperty("username"),
                Hooks.getProperty("telefono"),
                Hooks.getProperty("password"),
                Hooks.getProperty("password")
        );
        registerPage.clickAgree();
        registerPage.clickContinue();
    }

    @Entonces("el usuario recibe una advertencia de cuenta inválida")
    public void elUsuarioRecibeUnaAdvertenciaDeCuentaInválida() {

        Assert.assertTrue(registerPage.warningIsDisplayed());
    }
}

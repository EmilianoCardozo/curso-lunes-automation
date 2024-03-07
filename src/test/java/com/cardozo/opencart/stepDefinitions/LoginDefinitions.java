package com.cardozo.opencart.stepDefinitions;

import com.cardozo.opencart.pages.HomePage;
import com.cardozo.opencart.pages.LoginPage;
import com.cardozo.opencart.hooks.Hooks;
import com.github.javafaker.Faker;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class LoginDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;

    public LoginDefinitions () {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());

    }

    @Dado("que el usuario ingresa a la página de login")
    public void queElUsuarioIngresaALaPáginaDeLogin() {

        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();
    }

    @Cuando("el usuario se loguea con credenciales válidas")
    public void elUsuarioSeLogueaConCredencialesVálidas() {

        loginPage.setEmail(Hooks.getProperty("username"));
        loginPage.setPassword(Hooks.getProperty("password"));
        loginPage.clickLogin();
    }

    @Cuando("el usuario se loguea con credenciales inválidas")
    public void elUsuarioSeLogueaConCredencialesInválidas() {

        Faker faker = new Faker();

        loginPage.setEmail(Hooks.getProperty("username"));
        loginPage.setPassword(faker.internet().password());
        loginPage.clickLogin();
    }

    @Entonces("el usuario recibe una advertencia de login inválido")
    public void elUsuarioRecibeUnaAdvertenciaDeLoginInválido() {

        Assert.assertTrue(loginPage.warningIsDisplayed());
    }
}

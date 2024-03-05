package com.cardozo.stepDefinitions;

import com.cardozo.Pages.HomePage;
import com.cardozo.Pages.LoginPage;
import com.cardozo.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

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
}

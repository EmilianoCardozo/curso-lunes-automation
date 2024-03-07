package com.cardozo.opencart.stepDefinitions;

import com.cardozo.opencart.hooks.Hooks;
import com.cardozo.opencart.pages.AccountPage;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class AccountDefinitions {

    private AccountPage accountPage;

    public AccountDefinitions () {
        this.accountPage = new AccountPage(Hooks.getDriver());
    }

    @Entonces("el usuario recibe una confirmación de cuenta creada")
    public void elUsuarioRecibeUnaConfirmaciónDeCuentaCreada() {

        Assert.assertTrue(accountPage.confirmIsDisplayed());
    }
}

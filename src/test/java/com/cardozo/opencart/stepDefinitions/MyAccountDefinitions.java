package com.cardozo.opencart.stepDefinitions;

import com.cardozo.opencart.hooks.Hooks;
import com.cardozo.opencart.pages.MyAccountPage;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class MyAccountDefinitions {

    private MyAccountPage myAccountPage;

    public MyAccountDefinitions (){
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Entonces("el usuario se encuentra dentro de su cuenta")
    public void elUsuarioSeEncuentraDentroDeSuCuenta() {

        Assert.assertTrue(myAccountPage.titleIsDisplayed());

    }
}

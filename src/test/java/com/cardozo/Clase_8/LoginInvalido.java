package com.cardozo.Clase_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInvalido extends BaseTest {

    @Test
    public void loginInvalidoTest() {
        // Paso 1: levantar la pagina
        getDriver().get("https://opencart.abstracta.us/");

        // Paso 2: click en My Account
        By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
        WebElement myAccountEl = getDriver().findElement(myAccountBy);
        myAccountEl.click();

        // Paso 3: click en Login del dropdown
        By loginBy = By.xpath("//a[text()=\"Login\"]");
        WebElement loginEl = getDriver().findElement(loginBy);
        loginEl.click();

        // Paso 4: hacer login (ingresar user, pass y click en boton login)
        By inputEmailBy = By.id("input-email");
        By inputPassBy = By.id("input-password");
        By buttonLoginBy = By.xpath("//input[@value=\"Login\"]");

        WebElement inputEmailEl = getDriver().findElement(inputEmailBy);
        WebElement inputPassEl = getDriver().findElement(inputPassBy);
        WebElement buttonLoginEl = getDriver().findElement(buttonLoginBy);

        inputEmailEl.sendKeys("emic_08@hotmail.com");
        inputPassEl.sendKeys("4321");
        buttonLoginEl.click();

        // Paso 5: validaciones
        By warningBy = By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]");
        WebElement warningEl = getDriver().findElement(warningBy);

        Assert.assertTrue(warningEl.isDisplayed());
    }
}

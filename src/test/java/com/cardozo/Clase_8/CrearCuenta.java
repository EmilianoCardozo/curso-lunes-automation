package com.cardozo.Clase_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CrearCuenta extends BaseTest {

    @Test
    public void crearCuentaTest() {
        //Paso 1: levantar la página
        getDriver().get("https://opencart.abstracta.us/");

        //Paso 2: click en My Account
        By MyAccountBy = By.xpath("//a[@title=\"My Account\"]");
        WebElement MyAccountEl = getDriver().findElement(MyAccountBy);
        MyAccountEl.click();

        //Paso 3: click en Register
        By RegisterBy = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
        WebElement RegisterEl = getDriver().findElement(RegisterBy);
        RegisterEl.click();

        //Paso 4: completar formulario y continuar
        By inputNombreBy = By.id("input-firstname");
        By inputApellidoBy = By.id("input-lastname");
        By inputEmailBy = By.id("input-email");
        By inputTelefonoBy = By.id("input-telephone");
        By inputPassBy = By.id("input-password");
        By inputPassConfirmBy = By.id("input-confirm");
        By inputAgreeBy = By.name("agree");
        By buttonContinueBy = By.xpath("//input[@value=\"Continue\"]");

        WebElement inputNombreEl = getDriver().findElement(inputNombreBy);
        WebElement inputApellidoEl = getDriver().findElement(inputApellidoBy);
        WebElement inputEmailEl = getDriver().findElement(inputEmailBy);
        WebElement inputTelefonoEl = getDriver().findElement(inputTelefonoBy);
        WebElement inputPassEl = getDriver().findElement(inputPassBy);
        WebElement inputPassConfirmEl = getDriver().findElement(inputPassConfirmBy);
        WebElement inputAgreeEl = getDriver().findElement(inputAgreeBy);
        WebElement buttonContinueEl = getDriver().findElement(buttonContinueBy);

        inputNombreEl.sendKeys("Emiliano Jesús");
        inputApellidoEl.sendKeys("Cardozo");
        inputEmailEl.sendKeys("emic_15@hotmail.com");
        inputTelefonoEl.sendKeys("(351) 685-3850");
        inputPassEl.sendKeys("1234");
        inputPassConfirmEl.sendKeys("1234");
        inputAgreeEl.click();
        buttonContinueEl.click();

        //Paso 5: validación
        By tittleBy = By.xpath("//*[@id=\"account-register\"]/div[1]");
        WebElement tittleEl = getDriver().findElement(tittleBy);

        Assert.assertTrue(tittleEl.isDisplayed());

    }
}

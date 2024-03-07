package com.cardozo.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {
    private By inputNombreBy = By.id("input-firstname");
    private By inputApellidoBy = By.id("input-lastname");
    private By inputEmailBy = By.id("input-email");
    private By inputTelefonoBy = By.id("input-telephone");
    private By inputPassBy = By.id("input-password");
    private By inputPassConfirmBy = By.id("input-confirm");
    private By clickAgreeBy = By.name("agree");
    private By buttonContinueBy = By.xpath("//input[@value=\"Continue\"]");

    private By warningBy = By.xpath("//*[@id=\"account-register\"]/div[1]");


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void completarForm (
            String nombre,
            String apellido,
            String email,
            String telefono,
            String password,
            String passconfirm) {

            sendKeys(inputNombreBy, nombre);
            sendKeys(inputApellidoBy, apellido);
            sendKeys(inputEmailBy, email);
            sendKeys(inputTelefonoBy, telefono);
            sendKeys(inputPassBy, password);
            sendKeys(inputPassConfirmBy, passconfirm);
    }

    /*
    public void setNombre (String nombre) {
        sendKeys(inputNombreBy, nombre);
    }
    public void setApellido (String apellido) {
        sendKeys(inputApellidoBy, apellido);
    }
    public void setEmail (String email) {
        sendKeys(inputEmailBy, email);
    }
    public void setTelefono (String telefono) {
        sendKeys(inputTelefonoBy, telefono);
    }
    public void setPassword (String password) {
        sendKeys(inputPassBy, password);
    }
    public void setPasswordConfirm (String passconfirm) {
        sendKeys(inputPassConfirmBy, passconfirm);
    }

     */
    public void clickAgree () {
        click(clickAgreeBy);
    }
    public void clickContinue () {
        click(buttonContinueBy);
    }
    public boolean warningIsDisplayed () {
        return isDisplayed(warningBy);
    }

}

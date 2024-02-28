package com.cardozo.Clase_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyAccountPage {

    private By titleBy = By.xpath("//h2[text()=\"My Account\"]");
    private By inputNombreBy = By.id("input-firstname");
    private By inputApellidoBy = By.id("input-lastname");
    private By inputEmailBy = By.id("input-email");
    private By inputTelefonoBy = By.id("input-telephone");
    private By inputPassBy = By.id("input-password");
    private By inputPassConfirmBy = By.id("input-confirm");
    private By clickAgreeBy = By.name("agree");
    private By buttonContinueBy = By.xpath("//input[@value=\"Continue\"]");
    private By warningBy = By.xpath("//*[@id=\"account-register\"]/div[1]");
    private WebDriver driver;
    private WebDriverWait wait;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean titleIsDisplayed () {
        WebElement titleEl = wait.until(ExpectedConditions.visibilityOfElementLocated(titleBy));
        return titleEl.isDisplayed();
    }
    public void setNombre (String nombre) {
        WebElement inputNombreEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputNombreBy));
        inputNombreEl.sendKeys(nombre);
    }
    public void setApellido (String apellido) {
        WebElement inputApellidoEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputApellidoBy));
        inputApellidoEl.sendKeys(apellido);
    }
    public void setEmail (String email) {
        WebElement inputEmailEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmailBy));
        inputEmailEl.sendKeys(email);
    }
    public void setTelefono (String telefono) {
        WebElement inputTelefonoEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputTelefonoBy));
        inputTelefonoEl.sendKeys(telefono);
    }
    public void setPassword (String password) {
        WebElement inputPassEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassBy));
        inputPassEl.sendKeys(password);
    }
    public void setPasswordConfirm (String passconfirm) {
        WebElement inputPassConfirmEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassConfirmBy));
        inputPassConfirmEl.sendKeys(passconfirm);
    }
    public void clickAgree () {
        WebElement clickAgreeEl = wait.until(ExpectedConditions.elementToBeClickable(clickAgreeBy));
        clickAgreeEl.click();
    }
    public void clickContinue () {
        WebElement buttonContinueEl = wait.until(ExpectedConditions.elementToBeClickable(buttonContinueBy));
        buttonContinueEl.click();
    }
    public boolean warningIsDisplayed () {
        WebElement warningEl = wait.until(ExpectedConditions.visibilityOfElementLocated(warningBy));
        return warningEl.isDisplayed();
    }
}

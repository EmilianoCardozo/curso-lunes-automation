package com.cardozo.Clase_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private By inputEmailBy = By.id("input-email");
    private By inputPassBy = By.id("input-password");
    private By buttonLoginBy = By.xpath("//input[@value=\"Login\"]");
    private By warningBy = By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]");


    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setEmail (String email) {
        WebElement inputEmailEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmailBy));
        inputEmailEl.sendKeys(email);
    }

    public void setPassword (String password) {
        WebElement inputPassEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPassBy));
        inputPassEl.sendKeys(password);
    }

    public void clickLogin () {
        WebElement buttonLoginEl = wait.until(ExpectedConditions.elementToBeClickable(buttonLoginBy));
        buttonLoginEl.click();
    }

    public boolean warningIsDisplayed () {
        WebElement warningEl = wait.until(ExpectedConditions.visibilityOfElementLocated(warningBy));
        return warningEl.isDisplayed();
    }
}

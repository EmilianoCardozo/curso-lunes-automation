package com.cardozo.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    private By inputEmailBy = By.id("input-email");
    private By inputPassBy = By.id("input-password");
    private By buttonLoginBy = By.xpath("//input[@value=\"Login\"]");
    private By warningBy = By.xpath("//div[@class=\"alert alert-danger alert-dismissible\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail (String email) {
        sendKeys(inputEmailBy, email);
    }

    public void setPassword (String password) {
        sendKeys(inputPassBy, password);
    }

    public void clickLogin () {
        click(buttonLoginBy);
    }

    public boolean warningIsDisplayed () {
        return isDisplayed(warningBy);
    }
}

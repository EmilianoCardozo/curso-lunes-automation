package com.cardozo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    private By accountConfirm = By.xpath("//div[@id=\"content\"]");

    public AccountPage (WebDriver driver) {
        super(driver);
    }

    public boolean confirmIsDisplayed () {
        return isDisplayed(accountConfirm);
    }
}

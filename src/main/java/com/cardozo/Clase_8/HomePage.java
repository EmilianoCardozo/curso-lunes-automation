package com.cardozo.Clase_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private By inputBy = By.name("search");
    private By carrouselBy = By.id("content");
    private By menuBy = By.id("menu");
    private By myAccountBy = By.xpath("//a[@title=\"My Account\"]");
    private By loginBy = By.xpath("//a[text()=\"Login\"]");
    private By registerBy = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean inputIsDisplayed() {
        WebElement inputEl = wait.until(ExpectedConditions.visibilityOfElementLocated(inputBy));
        return inputEl.isDisplayed();
    }

    public boolean carrouselIsDisplayed() {
        WebElement carrouselEl = wait.until(ExpectedConditions.visibilityOfElementLocated(carrouselBy));
        return carrouselEl.isDisplayed();
    }

    public boolean menuIsDisplayed() {
        WebElement menuEl = wait.until(ExpectedConditions.visibilityOfElementLocated(menuBy));
        return menuEl.isDisplayed();
    }

    public boolean myAccountIsDisplayed() {
        WebElement myAccountEl = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountBy));
        return myAccountEl.isDisplayed();
    }

    public void clickMyAccount() {
        WebElement clickMyAccountEl = wait.until(ExpectedConditions.visibilityOfElementLocated(myAccountBy));
        clickMyAccountEl.click();
    }

    public void clickLoginDropdown() {
        WebElement loginEl = wait.until(ExpectedConditions.visibilityOfElementLocated(loginBy));
        loginEl.click();
    }

    public void clickRegisterDropdown() {
        WebElement registerEl = wait.until(ExpectedConditions.visibilityOfElementLocated(registerBy));
        registerEl.click();
    }

}
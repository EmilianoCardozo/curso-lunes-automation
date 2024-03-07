package com.cardozo.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritoPage extends BasePage {
    private By camerasBy = By.xpath("//a[text()=\"Cameras\"]");
    private By addCamera1By = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[2]");
    private By favoriteBy = By.xpath("//div[@class=\"table-responsive\"]");
    private By wishBy = By.id("wishlist-total");

    public FavoritoPage(WebDriver driver){
        super(driver);
    }

    public void clickCameras (){
        click(camerasBy);
    }
    public void addCamera1 (){
        click(addCamera1By);
    }

    public void clickWish() {
        click(wishBy);
    }
    public boolean favoriteIsDisplayed (){
        return isDisplayed(favoriteBy);
    }



}

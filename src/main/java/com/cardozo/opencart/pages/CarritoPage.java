package com.cardozo.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPage extends BasePage {

    private By TabletsBy = By.xpath("//a[text()=\"Tablets\"]");
    private By SamsungTabletBy = By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[2]/button[1]");
    private By SamsungTabletCarritoBy = By.xpath("//div/a[text()=\"Samsung Galaxy Tab 10.1\"]");

    public CarritoPage (WebDriver driver){
        super(driver);
    }

    public void ingresarATablets (){
        click(TabletsBy);
    }

    public void agregarTabletAlCarrito (){
        click(SamsungTabletBy);
    }

    public boolean tabletIsDisplayed () {
        return isDisplayed(SamsungTabletCarritoBy);
    }


}

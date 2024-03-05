package com.cardozo.Clase_8;

import com.cardozo.Pages.FavoritoPage;
import com.cardozo.Pages.HomePage;
import com.cardozo.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FavoriteTest extends BaseTest {

    @Test
    public void favoriteTest() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        FavoritoPage favoritoPage = new FavoritoPage(getDriver());

        getDriver().get("https://opencart.abstracta.us/");

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();

        loginPage.setEmail("emic_15@hotmail.com");
        loginPage.setPassword("1234");
        loginPage.clickLogin();

        favoritoPage.clickCameras();
        favoritoPage.addCamera1();

        favoritoPage.clickWish();

        Assert.assertTrue(favoritoPage.favoriteIsDisplayed());

    }
}

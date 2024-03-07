package com.cardozo.material_curso_automation.Clase_8;

import com.cardozo.opencart.pages.FavoritoPage;
import com.cardozo.opencart.pages.HomePage;
import com.cardozo.opencart.pages.LoginPage;
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

package com.cardozo.stepDefinitions;

import com.cardozo.Pages.FavoritoPage;
import com.cardozo.hooks.Hooks;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class FavoritosDefinitions {
    private FavoritoPage favoritoPage;

    public FavoritosDefinitions () {
        this.favoritoPage = new FavoritoPage(Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos() {
        favoritoPage.clickCameras();
        favoritoPage.addCamera1();
        favoritoPage.clickWish();
    }

    @Entonces("se valida que se agregó un producto a favoritos")
    public void seValidaQueSeAgregóUnProductoAFavoritos() {
        Assert.assertTrue(favoritoPage.favoriteIsDisplayed());
    }
}

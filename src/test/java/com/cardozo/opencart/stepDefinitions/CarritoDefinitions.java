package com.cardozo.opencart.stepDefinitions;

import com.cardozo.opencart.hooks.Hooks;
import com.cardozo.opencart.pages.CarritoPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class CarritoDefinitions {

    private CarritoPage carritoPage;

    public CarritoDefinitions (){
        this.carritoPage = new CarritoPage(Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {

        carritoPage.ingresarATablets();
        carritoPage.agregarTabletAlCarrito();
    }

    @Entonces("se valida que se agregó un producto al carrito")
    public void seValidaQueSeAgregóUnProductoAlCarrito() {

        carritoPage.tabletIsDisplayed();
    }
}

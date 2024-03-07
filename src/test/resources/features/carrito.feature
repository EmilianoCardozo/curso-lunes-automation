# language: es


  Característica: Carrito

    @CAR-001
    Escenario: Agregar al carrito
      Dado que el usuario ingresa a la página de login
      Y el usuario se loguea con credenciales válidas
      Cuando el usuario agrega un producto al carrito
      Entonces se valida que se agregó un producto al carrito
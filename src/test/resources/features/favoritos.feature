#language: es

Característica: Favoritos

  @FAV-123
  Escenario: Agregar un producto a favoritos
    Dado que el usuario ingresa a la página de login
    Y el usuario se loguea con credenciales válidas
    Cuando el usuario agrega un producto a favoritos
    Entonces se valida que se agregó un producto a favoritos
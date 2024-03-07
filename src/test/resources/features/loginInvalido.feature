# language: es


Característica: login

  @LOG-002
  Escenario: login inválido
    Dado que el usuario ingresa a la página de login
    Cuando el usuario se loguea con credenciales inválidas
    Entonces el usuario recibe una advertencia de login inválido
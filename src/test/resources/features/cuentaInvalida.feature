# language: es


Característica: Crear cuenta

  @CUE-002
  Escenario: Crear cuenta inválida
    Dado que el usuario ingresa a la pagina de registro
    Cuando el usuario se registra con credenciales inválidas
    Entonces el usuario recibe una advertencia de cuenta inválida
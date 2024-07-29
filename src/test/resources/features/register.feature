Feature: Registro de usuario
  @validos
  Scenario: Registro exitoso en el sistema
    Given Navego a la pagina de registro
    When Ingreso los valores del formulario de registro
    And Doy clic en el boton Register
    Then Deberia estar registrado exitosamente

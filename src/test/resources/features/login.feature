Feature: Inicio de sesion
  @validos
  Scenario: Inicio de sesion exitoso
    Given Navego hacia la pagina de inicio de sesion
    When Ingreso credenciales validas
    And Doy clic en el boton Login
    Then Deberia estar con la sesion iniciada exitosamente

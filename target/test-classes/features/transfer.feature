Feature: Transferir fondos

  @validos
  Scenario: Transferencia exitosa de fondos entre cuentas
    Given he iniciado sesion en el sistema para transferir
    When navego a la pagina de transferencia
    And ingreso el monto de la transferencia "50"
    And selecciono la cuenta origen "12345"
    And selecciono la cuenta destino "67890"
    And hago clic en el boton de transferencia
    Then deberia ver el mensaje de confirmacion de transferencia


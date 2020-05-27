Feature: Acceder al portal web de banitsmo y abrir el archivo de pdf de tarifas de cuentas de deposito

  @abrirPdf
  Scenario Outline: El usuario accede al portal web de banitsmo e ingresa a la opcion del menu inferior tarifario para abrir el pdf
    Given El usuario ingresa a la pagina de banitsmo
      | <id> | <menu> | <documento> | <ruta> |
    When Ingresa al menu inferior en la opcion tarifario
    And seleccona la opcion para abrir el pdf de tarifas de cuentas deposito
    Then Revisara que el archivo pdf se encuentre abierto con el nombre de este archivo

    Examples:
      | id | menu   | documento                                        | ruta |
      ##@externaldata@./src/test/resources/co/com/sophos/certification/challenge/externaldata/banistmo.xlsx@Sheet1
      | 1 | Tarifario | Tarifas de Cuentas de Depósitos | https://www.banistmo.com/wps/wcm/aldata@./src/test/resources/co/com/sophos/certification/reto/data/banconnect/aae1f540-6e90-4974-a27b-b8867a5fd2c9/S56_ActualizacionTarifarioDepositos_Dic2019+%281%29+%282%29.pdf?MOD=AJPERES&CVID=n8g171g |
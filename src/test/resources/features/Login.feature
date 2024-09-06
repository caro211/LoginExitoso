# language: es
Característica: Inicio de sesion

  @LoginExitoso
  Esquema del escenario: Inicio de sesion exitoso
    Dado que carolina abre la app
    Cuando realiza el login
      | usuario   |contrasena|
      | <usuario> |<contrasena>|

    Entonces Visualiza el mensaje de bienvenida
    Ejemplos:
      | usuario |contrasena|
      | pwertc  |1111      |


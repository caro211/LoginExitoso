# Framework de automatización basado en Screenplay para un login 

# [Acerca de]
Proyecto de automatización con SerenityBDD, screenplay y cucumber. 

## Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (userinterface).
La estructura completa del proyecto es la siguiente:

````
+ exceptions
    Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas
+ global
    Clases, enums o interfaces donde se concentran parametros generales de la aplicación (constantes, enums, etc)    
+ model
    Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interactions
    Clases que representan las interacciones directas con la interfaz de usuario
+ userinterface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objetos usados para consultar acerca del estado de la aplicación
+ util
    Clases de utilidad
+ runners
    Clases que permiten correr los tests
+ step definitions
    Clases que mapean las líneas Gherkin a código java
+ features
    La representación de las historias en archivos cucumber
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 11 y Gradle preferiblemente con la versión 8.0.1, Appium Server 2.0.1 (GUI), Android Studio con Android SDK


## Para correr el proyecto

Use el siguiente comando

    gradle clean test aggregate --stacktrace --warning-mode=all -Dcucumber.filter.tags="@[tag]"

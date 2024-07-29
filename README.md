# AutomationBGtest

Proyecto de Pruebas Automatizadas para BG
Este proyecto utiliza Selenium y Cucumber para realizar pruebas automatizadas en el portal bancario Parabank. Incluye casos de prueba para registrar, iniciar sesión y transferencias de fondos; la opcion de retiros NO ESTABA FUNCIONAL en la pagina

Tecnologías Utilizadas
Java 8 o superior
Maven como gestor de dependencias
Selenium WebDriver para la automatización del navegador
Cucumber para la definición de pasos de prueba
JUnit para la ejecución de pruebas

 ## Dependencias
 
<dependencies>
    <!-- Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.1.2</version>
    </dependency>

    <!-- Cucumber -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.2.3</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>7.2.3</version>
        <scope>test</scope>
    </dependency>

    <!-- JUnit -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.2</version>
        <scope>test</scope>
    </dependency>
</dependencies>

## Configuración del Proyecto
Instala Java y Maven:

Java: Descargar JDK
Maven: Descargar Maven
Configura el pom.xml:

Asegúrate de que el pom.xml esté configurado con las dependencias mencionadas anteriormente.

Descarga el Driver de Selenium:

Descarga el ChromeDriver desde aquí

Coloca el chromedriver en una ruta accesible. Actualiza el System.setProperty en el código con la ruta correcta.

## Ejecucion del proyecto
Ejecutar la clase Test Runner para la ejecucion de los casos de prueba automatizados y en la ruta del proyecto, se encontrara el arhivo de los resultados 'target/cucumber-reports'


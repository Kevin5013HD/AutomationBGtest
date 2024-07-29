package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("Navego hacia la pagina de inicio de sesion")
    public void navego_hacia_la_pagina_de_inicio_de_sesion() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        loginPage = new LoginPage(driver);
    }

    @When("Ingreso credenciales validas")
    public void ingreso_credenciales_validas() {
        loginPage.setUsername("kevin");
        loginPage.setPassword("zambrano");
    }

    @And("Doy clic en el boton Login")
    public void doy_clic_en_el_boton_login() {
        loginPage.clickLogin();
    }

    @Then("Deberia estar con la sesion iniciada exitosamente")
    public void deberia_estar_con_la_sesion_iniciada_exitosamente() {
        // Implementar la validación
        driver.quit();
    }
}

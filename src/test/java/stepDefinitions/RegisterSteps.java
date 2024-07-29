package stepDefinitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.RegisterPage;

public class RegisterSteps {
    WebDriver driver;
    RegisterPage registerPage;

    @Given("Navego a la pagina de registro")
    public void navego_a_la_pagina_de_registro() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        registerPage = new RegisterPage(driver);
    }

    @When("Ingreso los valores del formulario de registro")
    public void ingreso_los_valores_del_formulario_de_registro() {
        registerPage.setFirstName("kevin");
        registerPage.setLastName("zambrano");
    }

    @And("Doy clic en el boton Register")
    public void doy_clic_en_el_boton_register() {
        registerPage.clickRegister();
    }

    @Then("Deberia estar registrado exitosamente")
    public void deberia_estar_registrado_exitosamente() {
        // Implementar la validación
        driver.quit();
    }

}

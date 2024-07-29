package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageObjects.AccountPage;
import pageObjects.TransferPage;
import pageObjects.LoginPage;

public class TransferSteps {
    WebDriver driver;
    AccountPage accountPage;
    TransferPage transferPage;

    @Given("he iniciado sesion en el sistema para transferir")
    public void he_iniciado_sesion_en_el_sistema_para_transferir() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsername("kevin");
        loginPage.setPassword("zambrano");
        loginPage.clickLogin();
        accountPage = new AccountPage(driver);
    }

    @When("navego a la pagina de transferencia")
    public void navego_a_la_pagina_de_transferencia() {
        accountPage.clickTransferFunds();
        transferPage = new TransferPage(driver);
    }

    @And("ingreso el monto de la transferencia {string}")
    public void ingreso_el_monto_de_la_transferencia(String amount)  {
        transferPage.setAmount(amount);
    }

    @And("selecciono la cuenta origen {string}")
    public void selecciono_la_cuenta_origen(String fromAccount) {
        transferPage.setFromAccount(fromAccount);
    }

    @And("selecciono la cuenta destino {string}")
    public void selecciono_la_cuenta_destino(String toAccount) {
        transferPage.setToAccount(toAccount);
    }

    @And("hago clic en el boton de transferencia")
    public void hago_clic_en_el_boton_de_transferencia() {
        transferPage.clickTransfer();
    }

    @Then("deberia ver el mensaje de confirmacion de transferencia")
    public void deberia_ver_el_mensaje_de_confirmacion_de_transferencia() {
        String confirmationMessage = transferPage.getConfirmationMessage();
        assert "Transfer Complete".contains(confirmationMessage);
        driver.quit();
    }

}

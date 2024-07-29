package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By registerButton = By.xpath("//input[@value='Register']");

    public void setFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void setLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    // Implementar setters para los demás campos

    public void clickRegister() {
        driver.findElement(registerButton).click();
    }
}

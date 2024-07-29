package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By registerLink = By.linkText("Register");
    By loginLink = By.linkText("Log In");

    public void clickRegisterLink() {
        driver.findElement(registerLink).click();
    }

    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

}

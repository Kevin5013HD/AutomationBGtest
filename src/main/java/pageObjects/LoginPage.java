package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("//input[@value='Log In']");

    public void setUsername(String uname) {
        driver.findElement(username).sendKeys(uname);
    }

    public void setPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage {
    WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    By withdrawLink = By.linkText("Withdraw");
    By transferFundsLink = By.linkText("Transfer Funds");

    public void clickWithdraw() {
        driver.findElement(withdrawLink).click();
    }

    public void clickTransferFunds() {
        driver.findElement(transferFundsLink).click();
    }
}

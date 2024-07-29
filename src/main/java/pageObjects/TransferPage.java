package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferPage {

    WebDriver driver;

    public TransferPage(WebDriver driver) {
        this.driver = driver;
    }

    By amountField = By.id("amount");
    By fromAccountField = By.id("fromAccountId");
    By toAccountField = By.id("toAccountId");
    By transferButton = By.xpath("//input[@value='Transfer']");
    By confirmationMessage = By.xpath("//*[@id=\"showResult\"]/h1");

    public void setAmount(String amount) {
        driver.findElement(amountField).sendKeys(amount);
    }

    public void setFromAccount(String fromAccount) {
        driver.findElement(fromAccountField).sendKeys(fromAccount);
    }

    public void setToAccount(String toAccount) {
        driver.findElement(toAccountField).sendKeys(toAccount);
    }

    public void clickTransfer() {
        driver.findElement(transferButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }
}

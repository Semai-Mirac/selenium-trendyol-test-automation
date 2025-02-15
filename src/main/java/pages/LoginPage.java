package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTest {

    public LoginPage fillEmail(String text) {
        driver.findElement(By.id("login-email")).clear();
        driver.findElement(By.id("login-email")).sendKeys(text);
        return this;
    }

    public LoginPage fillPassword(String text) {
        driver.findElement(By.name("login-password")).sendKeys(text);
        return this;
    }

    public LoginPage clickLogin() {
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        return this;
    }

    public LoginPage errorMessageControl(String message) {
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='message']")).getText(), message);
        return this;
    }
}

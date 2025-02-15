import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginSuccessful(){
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail(email)
                .fillPassword(password)
                        .clickLogin();
        sleep(3000);
        String text = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Hesabım");
    }

    @Test
    public void loginUnSuccessful() throws InterruptedException {

        WebElement txtEmail = driver.findElement(By.id(("login-email")));

        txtEmail.sendKeys("ririwer150@perceint.com");
        driver.findElement(By.name("login-password")).sendKeys("Fidantest1233.");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='message']")).getText(),"E-posta adresiniz ve/veya şifreniz hatalı.");


        txtEmail.clear();
        txtEmail.sendKeys("ecoss@gmail.com");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='message']")).getText(),"E-posta adresiniz ve/veya şifreniz hatalı.");
    }


}

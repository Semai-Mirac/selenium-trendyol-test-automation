import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginSuccessful() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/giris");
        driver.manage().window().maximize();
        driver.findElement(By.id("login-email")).sendKeys("ririwer150@perceint.com");
        driver.findElement(By.name("login-password")).sendKeys("Fidantest123.");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).click();
        Thread.sleep(3000);
        String text = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        System.out.println(text);
        Assert.assertEquals(text,"Hesabım");
        driver.quit();
    }

}

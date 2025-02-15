package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTest {

    public MainPage accountControl(String text){
        String value = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        Assert.assertEquals(value,text);
        return this;
    }
}

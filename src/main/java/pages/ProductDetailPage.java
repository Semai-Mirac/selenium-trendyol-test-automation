package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ProductDetailPage extends BaseTest {

    public ProductDetailPage productNameControl(String text){
        Assert.assertEquals(text, driver.findElement(By.cssSelector("[class='pr-new-br']")).getText());
        return this;
    }
}

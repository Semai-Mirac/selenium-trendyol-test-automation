package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductListPage extends BaseTest {

    public String getFirstProductName(){
        String brand= driver.findElements(By.cssSelector("[class='prdct-desc-cntnr-ttl']")).get(0).getText();
        WebElement element= driver.findElements(By.cssSelector("[class='prdct-desc-cntnr-name hasRatings']")).get(0);
        String productName= element.getText();
        String description= driver.findElement(By.cssSelector("[class='product-desc-sub-text']")).getText();
        String product= brand+productName+description;
        System.out.println(product);
        element.click();
        return productName;
    }
}

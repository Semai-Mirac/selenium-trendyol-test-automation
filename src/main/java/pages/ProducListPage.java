package pages;

import base.BaseTest;
import org.openqa.selenium.By;

public class ProducListPage extends BaseTest {

    public ProducListPage getFirstProductName(){
        String producName = driver.findElements(By.cssSelector("[class='prdct-desc-cntnr-name hasRatings']")).get(0).getText();
        System.out.println(producName);
        return this;
    }
}

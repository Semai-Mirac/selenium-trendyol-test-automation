import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductListPage;
import pages.ProductDetailPage;

import java.util.ArrayList;

public class ProductTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    ProductListPage productListPage=new ProductListPage();
    ProductDetailPage productDetailPage=new ProductDetailPage();


    @Test
    public void productDetailNameControl(){
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        sleep(3000);
        mainPage.searchSendKeys("iphone 13 128 gb");

        String productName= productListPage.getFirstProductName();
        ArrayList<String> tab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(0));
        productDetailPage.productNameControl(productName);
    }

}

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProducListPage;

public class ProductTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    MainPage mainPage=new MainPage();
    ProducListPage producListPage=new ProducListPage();


    @Test
    public void productDetailNameControl(){
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        sleep(3000);
        mainPage.searchSendKeys("iphone 13 128 gb");
        producListPage.getFirstProductName();
    }

}

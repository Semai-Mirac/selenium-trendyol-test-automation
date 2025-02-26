import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    public void loginSuccessful() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                    .clickLogin();

        sleep(3000);

        mainPage.accountControl("Hesabım");
    }


    @Test
    public void loginUnSuccessful() {
        loginPage.fillEmail(email)
                .fillPassword("dinek")
                    .clickLogin();

        sleep(3000);

        loginPage.errorMessageControl("E-posta adresiniz ve/veya şifreniz hatalı.")
                .fillEmail("ecem@zehra.com")
                    .clickLogin();

        sleep(3000);

        loginPage.errorMessageControl("E-posta adresiniz ve/veya şifreniz hatalı.");
    }


    @Test
    public void requiredControl(){
        loginPage.clickLogin()
                .errorMessageControl("Lütfen geçerli bir e-posta adresi giriniz.")
                .fillEmail(email)
                .clickLogin()
                .errorMessageControl("Lütfen şifrenizi giriniz.")
                .fillPassword(password)
                .clickLogin();
        sleep(3000);
        mainPage.accountControl("Hesabım");
    }


    @Test
    public void maxMinCharControl(){
        loginPage.fillEmail("a")
                .fillPassword("a")
                .clickLogin()
                .errorMessageControl("E-posta alanı minimum 10 karakter olmalıdır")
                .fillEmail("meldazehraecemdineknurusluterzioğlulkajdbalsdbfaljbf")
                .fillPassword("241507587965844758sgfuagfjkadshfushıhljkjbvkhv")
                .clickLogin()
                .errorMessageControl("E-posta alanına maximum 50 karakter olmalıdır");
    }

}
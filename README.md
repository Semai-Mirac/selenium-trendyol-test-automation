Bu kod, Selenium WebDriver kullanarak Trendyol web sitesindeki giriş fonksiyonelliğini test etmek için yazılmış bir Java programıdır. TestNG framework'ü ile yapılandırılmış ve iki temel test senaryosu içermektedir:


1. Başarılı Giriş Testi (loginSuccessful):

Doğru kullanıcı adı ve şifre ile giriş yapmayı dener.
Giriş başarılı olursa, sayfanın üst kısmında "Hesabım" linkinin görünüp görünmediğini kontrol eder.


2. Başarısız Giriş Testi (loginUnSuccessful):

Yanlış şifre ile giriş yapmayı dener ve hata mesajını doğrular.
Yanlış kullanıcı adı ile giriş yapmayı dener ve hata mesajını doğrular.



Kodun Özellikleri:

@BeforeMethod: Her testten önce Chrome tarayıcısını açar ve Trendyol giriş sayfasına gider.
@AfterMethod: Her testten sonra tarayıcıyı kapatır.
WebElement: Web sayfasındaki elementlere erişmek ve etkileşimde bulunmak için kullanılır.
Assert: Beklenen sonuçları gerçek sonuçlarla karşılaştırmak için kullanılır.
Thread.sleep: Belirli bir süre beklemek için kullanılır (örneğin, sayfanın yüklenmesi için).



Özet:

Bu kod, Trendyol'un giriş fonksiyonelliğinin beklendiği gibi çalışıp çalışmadığını otomatikleştirilmiş bir şekilde test etmek için tasarlanmıştır. Farklı giriş senaryolarını test ederek, web sitesinin güvenliğini ve kullanıcı deneyimini sağlamaya yardımcı olur.

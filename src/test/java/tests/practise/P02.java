package tests.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
     /*
     . .Exercise2...
1-Driver oluşturalim
2-Java class'imiza chnomedriver.exet i tanitalim
3-Driver'in tum ekranı kaplamasini saglayalim
4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
5-"https://www.otto.de" adresine gidelim
6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
8-Ardindan "https://wisequarter.com/" adresine gidip
9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
10-Bir onceki web sayfamiza geri donelim
11-Sayfayı yenileyelim
12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

    public static void main(String[] args) throws InterruptedException {
        // 1-Driver oluşturalim
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        // 2-Java class'imiza chnomedriver.exet i tanitalim
        WebDriver driver = new ChromeDriver();
        // 3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();


        // 4-"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");

        // 5-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim. Egen oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        // driver.findElement(By.xpath("//*[@id=\"cookieBanner\"]/div/div/div[2]/button")).click();
        driver.findElement(By.xpath("//button[@class='p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton']")).click();

        // 6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String ottoTitle = driver.getTitle();
        System.out.println("ottoTitle" + ottoTitle);
        String ottoUrl = driver.getCurrentUrl();
        System.out.println("ottoUrl" + ottoUrl);
        // 7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        if (ottoTitle.contains("0TT0") && ottoUrl.contains("0TT0")) {
            System.out.println("Hem title hem Url OTTO kelimesi içeriyor\n Test Başarılı");

        } else {
            System.out.println("En az biri OTTO kelimesi içermiyor\n Test başarısız");
        }
        // 8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");
        // 9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String wiseBaslik = driver.getTitle();
        if (wiseBaslik.contains("Quarter")) {
            System.out.println("Wise title testi basarili");
        } else {
            System.out.println("Wise title testi basarisiz");
        }
        // 10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        Thread.sleep(2500);
        // 11-Sayfayı yenileyelim
        driver.navigate().refresh();
        Thread.sleep(2500);
        // 12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().back();
        Thread.sleep(2500);
        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.close();

    }
}

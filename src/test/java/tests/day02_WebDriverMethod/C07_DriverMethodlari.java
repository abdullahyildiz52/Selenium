package tests.day02_WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title)
        // “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://facebook.com");
        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Facebook title testi PASSED");
        }else {
            System.out.println("Facebook title testi failed\nActual title:" + actualTitle);
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

        String expectedUrlIcerik="facebook";
        String actualUrl=driver.getCurrentUrl();

        // 4.https://www.walmart.com/ sayfasina gidin.

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.

        //6. Tekrar “facebook” sayfasina donun

        // 7. Sayfayi yenileyin

        //8. Sayfayi tam sayfa (maximize) yapin

        //9.Browser’i kapatin


    }
}

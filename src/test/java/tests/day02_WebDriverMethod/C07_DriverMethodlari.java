package tests.day02_WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
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

        if (expectedUrlIcerik.contains("facebook")){
            System.out.println();
        }

        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
         String expectedIcerik="Walmart.com";
         String actualIcerik=driver.getTitle();

         if (expectedIcerik.contains(expectedIcerik)){
             System.out.println("walmart icerik sorgu testi Passed");
         }else {
             System.out.println("walmart icerik sorgu testi Failed");

         }
        Thread.sleep(3000);

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        Thread.sleep(3000);

        // 7. Sayfayi yenileyin
        driver.navigate().refresh();
        Thread.sleep(3000);

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();


        //9.Browser’i kapatin
        Thread.sleep(3000);
        driver.close();


    }
}

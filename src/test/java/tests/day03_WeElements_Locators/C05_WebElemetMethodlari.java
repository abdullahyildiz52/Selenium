package tests.day03_WeElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_WebElemetMethodlari {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> urunLinkSayisi=driver.findElements(By.tagName("a"));
        int expectedLInksayisi=147;
        int actualLinkSayisi= urunLinkSayisi.size();

        if (actualLinkSayisi==expectedLInksayisi){
            System.out.println("Link sayisi Testi Passed");
        }else {
            System.out.println("Link sayisi Testi failed");
        }
        //4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();


        //5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi=driver.findElement(By.id("sale_image"));
        if (specialOfferElementi.isDisplayed()){
            System.out.println("SpecialOffer Testi passes");
        }else {
            System.out.println("SpecialOffer Testi Failed");
        }
        //6- Sayfayi kapatin

        Thread.sleep(3000);
        driver.close();
    }
}

package tests.day03_WeElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_Locators {
    public static void main(String[] args) throws InterruptedException {
        /*
        Locator: verdigiimiz
        Selenium da 8 adet locator vardir

        - ilk 6 tanesi webelementi olusturan HTML kodun icerigine baglidir
                    1- By.id
                    2- By.name
                    3- By.className
                    4- By.linkText
                    5- By.partialLinkText
                    6- By.tagName
                 - son 2 tane ise her turlu web element icin kullanilabilir
                    7- By.xPath
                    8- By.cssSelector
         */
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon anasayfasina gidin
        driver.get("https://www.amazon.com");

        // arama cubuguna Nutella yazdirip aratin

        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();

        // gosterilen urun resimlerinin 10 dan fazla oldugunu test edin
        // locator stratejisi olarak by.classname secildiginde
        // class attribute nun deegeri space iceriyorsa
        // locate islemi basarisiz olabilir

        // List<WebElement> urunIsimElementleriList=driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
        List<WebElement> urunIsimElementleriList = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));

        if (urunIsimElementleriList.size()>10){
            System.out.println("Listelenen urun sayisi testi Passed");
        }else {
            System.out.println("Listelenen urun sayisi testi failed");
        }

        // 5.urun ismini yazdirin ve ismini nytella icerdigini test eedin
        String besinciUrunIsmi=urunIsimElementleriList.get(4).getText();
        System.out.println("besinci urun ismi :"+besinciUrunIsmi);
        String expectedIcerik="Nutella";

        if (besinciUrunIsmi.contains(expectedIcerik)){
            System.out.println("listelenen 5 urun isim testi Passed");
        }else {
            System.out.println("listelenen 5 urun isim testi Failed");
        }

        Thread.sleep(5000);
        driver.close();


    }
}

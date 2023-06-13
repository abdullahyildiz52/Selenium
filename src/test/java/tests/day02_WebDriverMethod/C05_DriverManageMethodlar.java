package tests.day02_WebDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethodlar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resource/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*

        implicitlyWait selenium dan gelen dinamik bir beklemedir.
        sayfanin yuklenmesi veya islem yaapilacak web elementlarinn bulunmasi icin
        beklenecek maximum sureyi belirler

        Driver bu sure dolana kadar verilerin gorevun yapilip yapiklmayacagini lontrol edeeer
        bu sure icierisinde
        gorev yapilamazzsa Exeption firlatip calismayi durdurur...

         */

        driver.get("https://wisequarter.com");
        System.out.println("baslangic konumu:"+driver.manage().window().getPosition());
        System.out.println("baslangic size :" + driver.manage().window().getSize());

        driver.manage().window().setSize(new Dimension(1200,500));
        driver.manage().window().setPosition(new Point(100,200));

        System.out.println("degisen yeni  konumu:"+driver.manage().window().getPosition());
        System.out.println("degisen yeni size :" + driver.manage().window().getSize());



        Thread.sleep(3000);
        // java dan gelir  ve yazdigimiz sure boyunca kodlari bekletir.
        driver.close();
    }
}

package tests.day02_WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMenageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://wisequarter.com");

        // driver'a url verirken www yazmasaniz da calisir
        // ANCAK https yazmazsaniz calismaz

        System.out.println("Ilk sayfa size: "+driver.manage().window().getSize());
        System.out.println("Ilk sayfanin konumu :"+driver.manage().window().getPosition());


        driver.manage().window().maximize();

        System.out.println("maximize sayfa size: "+driver.manage().window().getSize());
        System.out.println("maximize sayfanin konumu :"+driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen sayfa size: "+driver.manage().window().getSize());
        System.out.println("fullscreen  sayfanin konumu :"+driver.manage().window().getPosition());

        Thread.sleep(3000);
        driver.close();
    }
}

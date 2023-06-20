package tests.day04_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_xpath_text {
    public static void main(String[] args) throws InterruptedException {

        // bir onceki class ta ki locate leri text ile yapalm


        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);

        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteTextBox= driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteTextBox.isDisplayed()) {
            System.out.println("Delete kutusu goruntuleme testi passed");
        } else {
            System.out.println("Delete kutusu goruntuleme testi failed");

        }
        Thread.sleep(2000);

        // 4- Delete tusuna basin
        deleteTextBox.click();
        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi=driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveYaziElementi.isDisplayed()){
            System.out.println("addRemove yazi elementi gorunum testi Passed");
        }else {
            System.out.println("addRemove yazi elementi gorunum testi failed");

        }

        Thread.sleep(2000);
        driver.close();
    }
}

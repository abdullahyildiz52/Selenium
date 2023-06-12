package tests.day01_selenium_ilkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_SeleniumİlkOtomasyon {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
    }
}
/*
selenium ile testleri çalıştırırken iyi bir orkestra yöneticisi olamlısınız
hangi enstrüman ı ne için kullanacagınız ve angi aşamada hangi enst projeye dahil
edeceğinizi bilmeniz gerekir

selenium ile test otomasyonu için minimum olarak kullanmamız gereken entrumanlar
1 progtamlamam dılı (Java) - projeye dahil ettik

2 ıde (intelij) zaten ıntelıj ıle calısıyoruz

3 selennıum kutuphanesı- bunun için selenium.dev adrsinden kullandığımoız bılgısayara uygun
jar dosyalarını ındırp projemizin iine kopyaladık
bu jar dosyalarını projemize eklemek için -file/project structure/moduls/dependencees tab seçip
+ tuşuna basarak selenium klasöründeki tüm jar dosyalarını projeye ekledik

4 web driver - herkesın bılgısayarının ısleıtım sıstemı,bilgisayarında bulunan google chrome versıyonu
farklı oldugundan
kendı bılgısayarımız ve chrome browser sürümüne ygun olan selınum.dev adresındekı browser dosyasını
ındırıp projemıızın alstına kkopyladık

 */
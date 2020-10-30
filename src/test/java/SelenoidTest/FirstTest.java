package SelenoidTest;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObject.Unit;

import java.util.concurrent.TimeUnit;

public class FirstTest extends  Basic {

    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")

    @Test
    public void btest() {

        //Тестирование поиска в Гугл
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        Unit in = new Unit(getDriver());

        in.setSearchText("Привет");
        in.clickSubmitSearch();

        //Тестирование поиска в Яндекс
        /*getDriver().get("https://yandex.ru/")+;
        getDriver().manage().window().maximize();
        Unit in = new Unit(getDriver());

        in.setSearchText("iphone");
        in.clickSubmitSearch();*/

        //Тестирование поиска на букинг
       /* getDriver().get("https://www.booking.com/");
        getDriver().manage().window().maximize();
        Unit in = new Unit(getDriver());

        in.setSearchText("Москва");
        in.clickSubmitSearch();*/

        /*getDriver().get("https://www.toy.ru/");
       // getDriver().findElement(By.xpath(".//input[@name='Ntt']")).submit();
        //для максимального разрешения браузера
        getDriver().manage().window().maximize();

        Unit in = new Unit(getDriver());


       // in.clickSubmitSearch();

        //WebDriver searchButton = driver.findElement(By.cssSelector("input[name='Ntt']")).submit();
        //in.setSubmitSearch();
        in.setSearchText("Лего");
        in.clickSubmitSearch();
        */

        //Тестирование поиска в эльдорадо

        /*getDriver().get("https://www.eldorado.ru/");
        getDriver().manage().window().maximize();
        //getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Unit in = new Unit(getDriver());

        in.setSearchText("iphone");
        in.clickSubmitSearch();

        /*getDriver().get("https://www.mvideo.ru/");
        getDriver().manage().window().maximize();
        //getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Unit in = new Unit(getDriver());

        in.clickSearch();
        in.setSearchText("iphone");
        in.clickSubmitSearch();*/

        /*driver.get("https://www.mvideo.ru/");
        driver.manage().window().maximize();
        //.//a[@data-holder='#OrderStatusGA']
        driver.findElement(By.cssSelector("a[data-holder='#OrderStatusGA']")).click();
        driver.findElement(By.cssSelector("input[name='Ntt']")).click();
        driver.findElement(By.cssSelector("input[name='Ntt']")).sendKeys("Iphone");
        driver.findElement(By.cssSelector("button[type='submit']")).click();*/


    }
}

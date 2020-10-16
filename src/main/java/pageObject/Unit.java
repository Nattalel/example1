package pageObject;

import Selenium.Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class Unit extends Basic {

    public Unit(WebDriver driver) {
        super(driver);
    }

    //Тестирование поиска в Гугл
    /*@FindBy(xpath = ".//input[@title='Поиск']")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//input[@value='Поиск в Google'])[1]")
    private WebElement submitSearch;*/

    //Тестирование поиска в Яндекс
    /*@FindBy(xpath = ".//input[@name='text']")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//button[@role='button'])[1]")
    private WebElement submitSearch;*/

    //Тестирование поиска на букинг
   /* @FindBy(xpath = ".//input[@type='search']")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//button[@type='submit'])[1]")
    private WebElement submitSearch;*/


    //@FindBy(xpath = "(.//input[@name='q'])[1]")
    //private WebElement searchButton;

    //Тестирование поиска для магазина игрущек
    /*@FindBy(xpath = "(.//input[@name='q'])[1]")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//button[@type='submit'])[2]")
    private WebElement submitSearch;*/

    //Тестирование поиска в эльдорадо
    @FindBy(xpath = ".//input[@name='search']")
    private WebElement setSearchText;

    @FindBy(xpath = ".//button[@tabindex='-1']")
    private WebElement submitSearch;


    //public void setSubmitSearch() { click(searchButton); }

    /**
     * Вводим текст в поисковую строку.
     *
     * @param text
     */
    public void setSearchText(String text) {
        setText(setSearchText, text);
    }

    /**
     * Кликаем по кнопке Поиск в гугле.
     */
    public void clickSubmitSearch(){
        click(submitSearch);
    }

}

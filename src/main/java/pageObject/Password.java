package pageObject;

import Selenium.Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Password extends Basic {
    public Password(WebDriver driver) {
        super(driver);
    }

    //Тестирование поиска в Гугл
    @FindBy(xpath = ".//input[@type='password']")
    private WebElement setSearchText;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement submitSearch;
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

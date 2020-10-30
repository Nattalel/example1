package pageObject;

import Selenium.Basic;
import io.qameta.allure.Step;
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

    @Step("Вводим пароль")
    public void setSearchText(String text) {
        setText(setSearchText, text);
    }
    @Step("Кликаем на кнопку входа")
    public void clickSubmitSearch(){
        click(submitSearch);
    }
}

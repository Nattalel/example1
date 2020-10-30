package pageObject;

import Selenium.Basic;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signature extends Basic {
    public Signature(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//button[2]")
    private WebElement submitSearch;

    @FindBy(xpath = "(.//a[@class='mail-SettingsPopup__menu-item'])[1]")
    private WebElement submitSearch1;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement setClearField;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement setSearchText;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement saveSignature;

    @FindBy(xpath = ".//a[@class='yandex-header__logo-service yandex-header__logo-service_lang_ru count-me']")
    private WebElement clickYandexMail;

    @Step("Вводим подпись")
    public void setSearchText(String text) {
        setText(setSearchText, text);
    }
    @Step("Нажимаем на настройки")
    public void clickSubmitSearch(){
        click(submitSearch);
    }
    @Step("Выбираем 'Личные данные, подпись, портрет'")
    public void clickSubmitSearch1(){
        click(submitSearch1);
    }
    @Step("Очищаем поле ввода подписи")
    public void clearField(){ clear(setClearField); }
    @Step("Нажимаем на кнопку сохранения изменений")
    public void clickSaveSignature() {
        click(saveSignature);
    }
    @Step("Возвращаемся в почту")
    public void clickYandexMail() {
        click(clickYandexMail);
    }

}


package pageObject;

import Selenium.Basic;
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

    public void setSearchText(String text) {
        setText(setSearchText, text);
    }

    public void clickSubmitSearch(){
        click(submitSearch);
    }

    public void clickSubmitSearch1(){
        click(submitSearch1);
    }

    public void clearField(){
        clear(setClearField);
    }

    public void clickSaveSignature() {
        click(saveSignature);
    }

    public void clickYandexMail() {
        click(clickYandexMail);
    }

}


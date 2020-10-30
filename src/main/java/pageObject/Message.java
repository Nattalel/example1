package pageObject;

import Selenium.Basic;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Message extends Basic {
    public Message(WebDriver driver) {
        super(driver);
    }

    //Тестирование поиска в Гугл
    @FindBy(xpath = "(.//div[@is='x-bubbles'])[1]")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//input[@name])[1]")
    private WebElement setSearchText1;

    @FindBy(xpath = ".//div[@role='textbox']")
    private WebElement setSearchText2;

    @FindBy(xpath = "(.//button[@type='button'])[7]")
    private WebElement submitSearch;

    @FindBy(xpath = ".//a[@data-title='Входящие']")
    private WebElement submitSearch2;

    @FindBy(xpath = "(.//span[@title])[3]")
    private WebElement submitSearch3;

    @FindBy(xpath = "(.//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_body js-message-snippet-body'])[1]")
    private WebElement submitSearch4;

    @FindBy(xpath = "(.//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_body js-message-snippet-body'])[2]")
    private WebElement submitSearch5;

//    @FindBy(xpath = ".//div[@class='mail-Message-Toolbar-Subject mail-Message-Toolbar-Subject_message js-toolbar-subject js-subject-content js-invalid-drag-target']")
//    private WebElement getScreenShot;

    @FindBy(xpath = "(.//span[@class='mail-MessageSnippet-Item mail-MessageSnippet-Item_subject'])[1]")
    private WebElement getScreenShot;

    @FindBy(xpath = "(.//span/div)[2]")
    private WebElement getThemeMessage;

    @FindBy(xpath = ".//div[@class='js-message-body-content mail-Message-Body-Content']")
    private WebElement getTextMessage;

    @FindBy(xpath = "(.//span[@class='mail-ui-Arrow'])[1]")
    private WebElement listMessage1;

    @FindBy(xpath = "(.//span[@class='mail-ui-Arrow'])[2]")
    private WebElement listMessage2;

    @Step("Ввод почты, на которую отправляется сообщение")
    public void setSearchText(String text)  { setText(setSearchText, text);  }
    @Step("Ввод темы сообщения")
    public void setSearchText1(String text) { setText(setSearchText1, text); }
    @Step("Ввод текста сообщения")
    public void setSearchText2(String text) {
        setText(setSearchText2, text);
    }

    @Step("Нажимаем кнопку отправить сообщение")
    public void clickSubmitSearch()  { click(submitSearch);  }
    @Step("Переход в раздел входящих")
    public void clickSubmitSearch2() { click(submitSearch2); }
    @Step("Обновление раздела входящих")
    public void clickSubmitSearch3(){
        click(submitSearch3);
    }
    @Step("Открываем сообщение")
    public void clickSubmitSearch4() { click(submitSearch4); }
    @Step("Открываем сообщение")
    public void clickSubmitSearch5(){
        click(submitSearch5);
    }

    @Step("Получаем тему сообщения в разделе входящих")
    public String getScreenShot( ){ return getText(getScreenShot); }
    @Step("Получаем тему сообщения в открытом письме")
    public String getThemeMessage( ){ return getText(getThemeMessage); }
    @Step("Получаем текст сообщения в открытом письме")
    public String getTextMessage( ){ return getText(getTextMessage); }

    @Step("Закрываем список сообщений 1")
    public void clickListMessage1(){
        click(listMessage1);
    }
    @Step("Закрываем список сообщений 2")
    public void clickListMessage2(){
        click(listMessage2);
    }




}

package pageObject;

import Selenium.Basic;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteMessage extends Basic {
    public DeleteMessage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(.//span[@class='mail-ui-Arrow'])[1]")
    private WebElement listMessage1;

    @FindBy(xpath = "(.//span[@class='mail-ui-Arrow'])[4]")
    private WebElement listMessage2;

    @FindBy(xpath = "(.//span[@class='_nb-checkbox-flag _nb-checkbox-normal-flag'])[1]")
    private WebElement submitSearch1;

    @FindBy(xpath = "(.//span[@class='_nb-checkbox-flag _nb-checkbox-normal-flag'])[2]")
    private WebElement submitSearch2;

    @FindBy(xpath = ".//div[@title='Удалить (Delete)']")
    private WebElement delMessage;

    @FindBy(xpath = ".//div[@class='b-messages__placeholder-item']")
    private WebElement clearMessage;


    @Step("Ставим чекбокс на 1 сообщение")
    public void clickSubmitSearch1(){
        click(submitSearch1);
    }
    @Step("Ставим чекбокс на  2 сообщение")
    public void clickSubmitSearch2(){
        click(submitSearch2);
    }
    @Step("Удаляем сообщения")
    public void clickDelMessage() {
        click(delMessage);
    }

    @Step("Проверяем отсутсвие сообщений в списке входящих")
    public void clickClearMessage( ){
        waitVisibilityOfElement(clearMessage);

        if (waitVisibilityOfElement(clearMessage)) {
            System.out.println("Сообщений нет");
        }
    }

    @Step("Проверка, что сообщения удалены")
    public void clickDeleteMes(String test){
        String xpath = ".//span[contains(.,'"+test+"')]//ancestor::a";
        assert (!waitPresentOfElement(xpath));
        System.out.println("Сообщения удалены");
    }


}


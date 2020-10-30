package pageObject;

import Selenium.Basic;
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


    public void clickSubmitSearch1(){
        click(submitSearch1);
    }
    public void clickSubmitSearch2(){
        click(submitSearch2);
    }
    public void clickDelMessage() {
        click(delMessage);
    }


    public void clickClearMessage( ){
        waitVisibilityOfElement(clearMessage);

        if (waitVisibilityOfElement(clearMessage)) {
            System.out.println("Сообщений нет");
        }
    }

}


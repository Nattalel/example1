package pageObject;

import Selenium.Basic;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mail extends Basic {

    public Mail(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(.//a[@title])[1]")
    private WebElement submitSearch;

    //@FindBy(xpath = ".//div[@data-key='box=right-box']")
    @FindBy(xpath = "(.//div[@is])[1]")
    private WebElement listBarGroupLink;

    @FindBy(xpath = "(.//div[@class='mail-Message-Sender']/span)[1]")
    private WebElement getSignature;

    @Step("Кликаем на кнопку написать письмо")
    public void clickSubmitSearch(){ click(submitSearch); }

    @Step("Поверка, что форма написания письма открыта")
    public void assertImagesTabIsOpen() {
        waitVisibilityOfElement(listBarGroupLink);

        if (waitVisibilityOfElement(listBarGroupLink)) {
            System.out.println("Форма написания письма открыта");
        }
    }

    @Step("Проверка подписи")
    public String getSignature( ){ return getText(getSignature); }

}

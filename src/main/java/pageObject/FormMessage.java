package pageObject;

import Selenium.Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormMessage extends Basic {
    public FormMessage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@data-key='box=right-box']")
    private WebElement listBarGroupLink;


    public void assertTrue(Boolean waitVisibilityOfElement) {
        waitVisibilityOfElement(listBarGroupLink);
    }


    public void meth(String text){
        String xpath = ".//div[contains(.,'"+text+"')]";
        assert (waitPresentOfElement(xpath));
    }

}

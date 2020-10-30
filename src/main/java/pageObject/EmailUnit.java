package pageObject;

import Selenium.Basic;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailUnit extends Basic {

    public EmailUnit(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//a[@data-reactid='24']")
    private WebElement submitSearch;

    @Step("Открывем почту")
    public void clickSubmitSearch(){
        click(submitSearch);
    }

}

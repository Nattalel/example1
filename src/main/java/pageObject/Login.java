package pageObject;

import Selenium.Basic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Basic {
    public Login(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = ".//input[@name='login']")
    private WebElement setSearchText;

    @FindBy(xpath = ".//button[@data-t='button:action']")
    private WebElement submitSearch;


    public void setSearchText(String text) {
        setText(setSearchText, text);
    }

    public void clickSubmitSearch(){
        click(submitSearch);
    }
}

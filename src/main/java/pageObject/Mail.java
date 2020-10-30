package pageObject;

import Selenium.Basic;
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


    public void clickSubmitSearch(){ click(submitSearch); }

    public void assertImagesTabIsOpen() {
        waitVisibilityOfElement(listBarGroupLink);

        if (waitVisibilityOfElement(listBarGroupLink)) {
            System.out.println("Форма написания письма открыта");
        }
    }

//    public String getSignature( ){
//        System.out.println(getText(getSignature));
//        return getText(getSignature);
//    }

//    public void getSignature( ){
//        System.out.println(getText(getSignature));
//        //return getText(getSignature);
//    }
    public String getSignature( ){ return getText(getSignature); }

}

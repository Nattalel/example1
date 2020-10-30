package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {
    private WebDriver driver;

    protected final int driverWaitTime = 20;

    public Basic(final WebDriver driver) {
        PageFactory.initElements(driver, this);

        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Ждем пока элемент отобразится на странице.
     * Метод возвращает Boolean.
     *
     * @param element
     * @return
     */
    public Boolean waitVisibilityOfElement(final WebElement element) {
        //   switchToFrame();
        //будет ждать, пока элеменот появится на странице
        WebDriverWait wait = new WebDriverWait(driver, driverWaitTime);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            //          switchToDefaultFrame();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //      switchToDefaultFrame();
        return false;
    }

    /**
     * Метод ждет пока элемент появится на странице.
     * Затем кликает по этому элементу.
     *
     * @param webElement
     */
    protected void click(final WebElement webElement) {

        waitVisibilityOfElement(webElement);

        webElement.click();

    }

    protected void clear(final WebElement webElement) {

        waitVisibilityOfElement(webElement);

        webElement.clear();

    }

    /**
     * Вводит текст в поле webElement.
     *
     * @param webElement
     * @param string
     */
    protected void setText(final WebElement webElement, final String string) {
        waitVisibilityOfElement(webElement);

        webElement.sendKeys(string);

    }


    /**
     * Метод ждет появления элемента на странице.
     * Затем забирает текст элемента.
     *
     * @param webElement
     * @return
     */
    protected String getText(final WebElement webElement) {
        waitVisibilityOfElement(webElement);

        return webElement.getText();
    }

}

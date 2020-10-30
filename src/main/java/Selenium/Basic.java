package Selenium;

import org.openqa.selenium.By;
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


      /* Ждем пока элемент появится в ДОМе.
       * Метод возвращает Boolean.
       *
       * @param xpath
       * @return
        */
    protected Boolean waitPresentOfElement(final String xpath) {
        //   switchToFrame();
        WebDriverWait wait = new WebDriverWait(driver, driverWaitTime);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            //          switchToDefaultFrame();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Метод ждет появления элемента по xpath.
     * Ищет элемент через findElement.
     * Кликает по элементу.
     *
     * @param xpath
     */
    protected void click(final String xpath) {
        waitPresentOfElement(xpath);
        WebElement webElement = getDriver().findElement(By.xpath(xpath));
        waitVisibilityOfElement(webElement);
        webElement.click();
    }


}

package newtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Oneclass {

    @BeforeTest
    public void met1() {
        System.out.println("Перед Тестом");
    }

    @AfterTest
    public void met2() {
        System.out.println("После Теста");
    }

    @BeforeMethod
    public void met3() {
        System.out.println("Перед Методом");
    }

    @AfterMethod
    public void met4() {
        System.out.println("После Метода");
    }

}

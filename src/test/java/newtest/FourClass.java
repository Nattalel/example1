package newtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FourClass extends Oneclass {

    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"Город", "Рязань"},
                {"Страна", "Россия"}
        };

        return browserProperty;
    }

    @Test(dataProvider = "SetEnvironment")
    public void stesting(String ab, String bc) {
        System.out.println(ab + " " + bc);
    }


}

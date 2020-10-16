package newtest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Freeclass  {

    @Parameters({"iDoNotKnow", "iKnow"})
    @Test

    public void stest(String str1, String str2) {
        System.out.println(str1 + " " + str2);
    }

}

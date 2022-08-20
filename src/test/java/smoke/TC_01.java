package smoke;

import com.learning.base.TestBase;
import org.testng.annotations.Test;

public class TC_01 extends TestBase {

    @Test
    public void validateLoginTest(){
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        homePage.login("supriyo", "supriyo");
    }
}

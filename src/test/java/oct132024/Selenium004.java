package oct132024;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium004 {

    @Test
    public void test_001() {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("Https://google.com");

    }
}

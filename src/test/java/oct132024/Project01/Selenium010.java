package oct132024.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium010 {

    @Test
    public void titleverify() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com/login");
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
    }
}

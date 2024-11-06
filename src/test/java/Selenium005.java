import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium005 {

    @Test
    public void test_001() {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");


        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.navigate().to("https://google.com");

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://google.com");

    }
}

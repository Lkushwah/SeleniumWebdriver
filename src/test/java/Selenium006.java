import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium006 {

    @Test
    public void test_001() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver = new FirefoxDriver();
        driver.get("https://google.com");
    }
}

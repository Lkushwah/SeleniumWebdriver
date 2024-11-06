import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium008 {

    @Test
    public void quitvsclose() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

//        driver.close();
        driver.quit();

    }

}

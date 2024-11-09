package oct132024;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Selenium007 {


    @Test
    public void testmothod01() {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--headless");
        edgeOptions.addExtensions(new File(""));
        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://sdet.live");


    }

}

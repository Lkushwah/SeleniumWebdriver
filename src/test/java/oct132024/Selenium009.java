package oct132024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class Selenium009 {
    @Test
    public void navigate() throws MalformedURLException {

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.navigate().to("http://google.com");
        edgeDriver.navigate().to(new URL("http://sdet.live"));
    }
}

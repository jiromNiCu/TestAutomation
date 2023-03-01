package hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import managers.drivers;

public class Hooks {
    public WebDriver driver = null;
    @Before
    public void beforeScenario() {
        System.out.println("Before");
        drivers.chromeDriver();
        drivers.getDriver().manage().window().maximize();

    }
    @After
    public void afterScenario() {
        System.out.println("After");
        drivers.getDriver().quit();
    }


}

package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class drivers {
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public static void chromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }

    public static RemoteWebDriver getDriver(){
        return driver.get();
    }
}

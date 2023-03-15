package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class drivers {
    public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public static void chromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver(chromeOptions));
    }

    public static RemoteWebDriver getDriver(){
        return driver.get();
    }
}

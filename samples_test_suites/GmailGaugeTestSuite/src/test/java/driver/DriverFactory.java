package driver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

    // Get a new WebDriver Instance.
    // There are various implementations for this depending on browser. The required browser can be set as an environment variable.
    // Refer http://getgauge.io/documentation/user/current/managing_environments/README.html
    public static WebDriver getDriver() {

        String browser = System.getenv("BROWSER");
        browser = (browser == null) ? "CHROME": browser;

        switch (browser) {
            case "IE":
                InternetExplorerDriverManager.getInstance().setup();
                return new InternetExplorerDriver();
            case "FIREFOX":
                FirefoxDriverManager.getInstance().setup();
                return new FirefoxDriver();
            case "CHROME":
            default:
	            ChromeDriverManager.getInstance().version("81.0.4044.69").setup();
	
	            ChromeOptions options = new ChromeOptions();
	            if ("Y".equalsIgnoreCase(System.getenv("HEADLESS"))) {
	                options.addArguments("--headless");
	                options.addArguments("--disable-gpu");
	            }
	            options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
	
	            return new ChromeDriver(options);
        }
    }
}

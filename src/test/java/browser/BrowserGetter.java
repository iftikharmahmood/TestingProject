package browser;

import org.openqa.selenium.WebDriver;

public class BrowserGetter {

    public WebDriver getDriver() {
        switch (System.getProperty("browser").toLowerCase()) {
            case "chrome" :
                System.out.println("Chrome was chosen!");
                return getChromeDriver();
            case "firefox" :
                System.out.println("Firefox was chosen!");
                return getFirefoxDriver();
            default:
                throw new RuntimeException("Unsupported browser! Will not start any browser!");
        }
    }

    private WebDriver getChromeDriver() {
        return null;
    }

    private WebDriver getFirefoxDriver() {
        return null;
    }

   /* private WebDriver getFirefoxDriver() {
        return null;
    }

    private WebDriver getChromeDriver(){
        return null;
    } */
}

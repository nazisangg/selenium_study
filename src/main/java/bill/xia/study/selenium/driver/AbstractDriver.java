package bill.xia.study.selenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class AbstractDriver {
    private WebDriver webDriver;
    private ChromeDriver chromeDriver;




    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ChromeDriver getChromeDriver() {
        return chromeDriver;
    }

    public void setChromeDriver(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }
}

package bill.xia.study.selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class ChromeDriverTest {
    public WebDriver driver;
    @Test
    public void main() {
        driver.navigate().to("http://www.baidu.com");
        String strPageTitle = driver.getTitle();
        System.out.println("Page title: - "+strPageTitle);
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("百度一下，你就知道"), "Page title doesn't match");
    }
    @BeforeClass
    public void beforeMethod() {
        File file = new File("/usr/local/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.baidu.com");
    }
    @AfterClass
    public void afterMethod() {
        driver.quit();
    }
}

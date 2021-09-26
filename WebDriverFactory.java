package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static Pages.Constant.*;
import static Pages.Constant.PATH_TO_EDGE_DRIVER;

public class WebDriverFactory {

    public WebDriver createWebDriverInstance(BrowserName browserType){
        switch (browserType){
            case FIREFOX:
            System.setProperty(FIREFOX_WEBDRIVER_PROPERTY, PATH_TO_FIREFOX_DRIVER);
            return new FirefoxDriver();
            case EDGE:
            System.setProperty(EDGE_WEBDRIVER_PROPERTY, PATH_TO_EDGE_DRIVER);
            return new EdgeDriver();
            default:
            System.setProperty(EDGE_WEBDRIVER_PROPERTY, PATH_TO_EDGE_DRIVER);
            return new EdgeDriver();
        }

    }
}

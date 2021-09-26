package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import static Pages.Constant.*;

public class WebDriverProvider {

   /* public static String webDriverName = "edge";
    private static WebDriver webDriver;

    public static WebDriver getWebdriver() {
        if (webDriver == null) {
            webDriver = createWebDriver(webDriverName);
        }return webDriver; }
*/

    /*private static WebDriver createWebDriver(String webDriverName) {
        if(webDriverName.equals("edge")) {
            System.setProperty(EDGE_WEBDRIVER_PROPERTY, PATH_TO_EDGE_DRIVER);
            return new EdgeDriver();
        }else if (webDriverName.equals("firefox")){
            System.setProperty(FIREFOX_WEBDRIVER_PROPERTY, PATH_TO_FIREFOX_DRIVER);
            return new FirefoxDriver();
        }else System.setProperty(EDGE_WEBDRIVER_PROPERTY, PATH_TO_EDGE_DRIVER);
        return new EdgeDriver(); }*/


    public static final WebDriverProvider INSTANCE = new WebDriverProvider();
    private ThreadLocal <WebDriver> WEBDRIVER = new ThreadLocal<WebDriver>();

    private WebDriverProvider(){};

    public WebDriver getWebDriver() {
        if (WEBDRIVER.get() == null) {
            String browserName = (System.getProperty(BROWSER_NAME_PROPERTY)==null)?
                    loadProperties().getProperty(BROWSER_NAME_PROPERTY):System.getProperty(BROWSER_NAME_PROPERTY);

        WebDriver createWebDriver = new WebDriverFactory().createWebDriverInstance(BrowserName.valueOf(browserName));
            WEBDRIVER.set(createWebDriver);
        }
        return WEBDRIVER.get();
    }



    public void removeWebriver() {
        WEBDRIVER.get().quit();
        WEBDRIVER.remove();
    }

    public static Properties loadProperties() {

    String separator = System.getProperty("file.separator");
    String resourcesFolder = "src" + separator + "test" + separator + "resources";

    Path file = Paths.get(resourcesFolder + separator + FILE_WITH_PROPERTIES);

    Properties properties = new Properties();

    try {
        properties.load(Files.newInputStream(file));
    } catch (IOException e) {
        throw new RuntimeException("No such file is found");
    }
    return properties;
}


}

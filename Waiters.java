package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {

    public static void waitUntilElementIsAvailable(WebElement webElement){
        (new WebDriverWait(WebDriverProvider.INSTANCE.getWebDriver(), 20))
                .until(ExpectedConditions.visibilityOfAllElements(webElement)); }

}

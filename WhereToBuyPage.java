package Pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WhereToBuyPage extends AbstractPage  {

    WebDriver webDriver;

    @FindBy (id = "locationName")
    private WebElement zipInputField;

    @FindBy (css = ".search-submit")
    private WebElement searchButton;

    @FindBy (css = ".map")
    private WebElement map;

    public WhereToBuyPage (WebDriver webDriver) {
        super();
        this.webDriver = WebDriverProvider.INSTANCE.getWebDriver();
         }

    @Step
   public void searchAreaByZipCode(){
       zipInputField.sendKeys("2000");
       searchButton.click();
       Waiters.waitUntilElementIsAvailable(map); }

    @Step
    public WebElement findMap(){
        return map; }}

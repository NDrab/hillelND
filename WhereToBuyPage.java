package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WhereToBuyPage {

    WebDriver webDriver;

    @FindBy (id = "locationName")
    private WebElement zipInputField;

    @FindBy (css = ".search-submit")
    private WebElement searchButton;

    @FindBy (css = ".map")
    private WebElement map;

    public WhereToBuyPage (WebDriver webDriver) { this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this); }

   public void SearchAreaByZipCode(){

       zipInputField.sendKeys("2000");
       searchButton.click();
       (new WebDriverWait(webDriver, 10))
               .until(ExpectedConditions.visibilityOf(map));
    }

    public WebElement FindMap(){
        return map;
    }
}
